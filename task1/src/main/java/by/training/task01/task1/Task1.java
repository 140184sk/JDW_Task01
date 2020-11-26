package by.training.task01.task1;

import java.util.Scanner;

//1.	Написать программу, позволяющую по последней цифре числа определить последнюю цифру его квадрата.

public class Task1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int lastNumeral;

		System.out.print("Введите последнюю цифру Вашего числа: >> ");

		lastNumeral = sc.nextInt();
		if (lastNumeral >= 0) {
			System.out.println("Последняя цифра квадрата Вашего числа: >> " + square(lastNumeral));
		} else {
			System.out.println("Цифра должна быть неотрицательной, перезапустите программу");
		}

	}

	static int square(int a) {

		int b = (a * a) % 10;

		return b;

	}

}
