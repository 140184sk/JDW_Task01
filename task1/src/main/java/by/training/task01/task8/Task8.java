package by.training.task01.task8;
//	Вычислить значение функции:
//    при x>=3, y = -x2+3*x+9.
//    при x<3, y = 1/(x3-6).

public class Task8 {

	public static void main(String[] args) {
		double x = 3;
		System.out.println("Значение функции y равно: " + valueOfFunction(x));
	}

// определение значения функции.
	static double valueOfFunction(double x) {
		double valueOfFunction;
		if (x >= 3) {
			valueOfFunction = -Math.pow(x, 2) + 3 * x + 9;
		} else {
			valueOfFunction = 1 / (Math.pow(x, 3) - 6);
		}
		return valueOfFunction;
	}
}
