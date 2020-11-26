package by.training.task01.task5;

//	Составить программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае: 
//	является ли целое число совершенным (сумма делителей равна самому числу).
public class Task5 {

	public static void main(String[] args) {

		int number = 496;

		System.out.println(isPerfectNumber(sumOfDividers(number), number));
	}

// опрделение суммы делителей числа.
	static int sumOfDividers(int n) {
		int sumOfDividers = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sumOfDividers += i;
			}
		}

		return sumOfDividers;
	}

// определение является ли число совершенным.
	static boolean isPerfectNumber(int n, int m) {
		if (n == m) {
			return true;
		} else {
			return false;
		}

	}
}