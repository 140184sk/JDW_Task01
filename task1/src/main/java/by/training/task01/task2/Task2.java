package by.training.task01.task2;

import java.util.Scanner;

//   	Составить программу, которая по заданным году и номеру месяца определяет количество дней в этом месяце 
//      и корректно определялись все високосные года.
public class Task2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int yearNumber;
		int monthNumber;

		System.out.print("Введите номер года (положительное число): >> ");
		yearNumber = sc.nextInt();

		yearPrint(yearIsLeap(yearNumber));

		System.out.print("Введите номер месяца (число от 1 до 12): >> ");
		monthNumber = sc.nextInt();
		System.out.println(monthCountDays(monthNumber, yearIsLeap(yearNumber)));
	}

	// Определение, високосный ли год;
	static boolean yearIsLeap(int y) {
		if (y % 400 == 0) {
			return true;
		} else if (y % 100 == 0 && y % 400 != 0) {
			return false;
		} else if (y % 4 == 0) {
			return true;
		} else {
			return false;
		}
	}

	static void yearPrint(boolean b) {
		if (b) {
			System.out.println("Год, который Вы ввели, является високосным.");
		} else {
			System.out.println("Год, который Вы ввели, не является високосным.");
		}
	}

	// Определение количества дней в месяце;
	static String monthCountDays(int m, boolean b) {
		if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
			return "В Вашем месяце 31 день";
		} else if (m == 4 || m == 6 || m == 9 || m == 11) {
			return "В Вашем месяце 30 дней";
		} else if (m == 2 && b) {
			return "В Вашем месяце 29 дней";
		} else {
			return "В Вашем месяце 28 дней";
		}
	}
}
