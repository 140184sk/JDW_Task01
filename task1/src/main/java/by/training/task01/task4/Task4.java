package by.training.task01.task4;

//    Составить программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае: 
//	  среди заданных целых чисел А, В, С, D есть хотя бы два четных.

public class Task4 {

	public static void main(String[] args) {
		int A = 20;
		int B = 11;
		int C = 19;
		int D = 64;

		System.out.println(twoEven(A, B, C, D));
	}

// определение количества четных чисел.
	static boolean twoEven(int a, int b, int c, int d) {
		if (a % 2 == 0 && b % 2 == 0 || a % 2 == 0 && c % 2 == 0 || a % 2 == 0 && d % 2 == 0 || b % 2 == 0 && c % 2 == 0
				|| b % 2 == 0 && d % 2 == 0 || c % 2 == 0 && d % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
