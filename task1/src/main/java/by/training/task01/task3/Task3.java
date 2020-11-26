package by.training.task01.task3;

//	Окружность вписана в квадрат заданной площади. Найти площадь квадрата, вписанного в эту окружность. 
//  Во сколько раз площадь вписанного квадрата меньше площади заданного?
public class Task3 {

	public static void main(String[] args) {
		double areaOfSquare = 124.8;
		double areaOfSquare1 = areaOfSquare1(sideOfSquare(areaOfSquare));
		System.out.println("Площадь вписанного квадрата меньше площади заданного квадрата в "
				+ areaOfSquare / areaOfSquare1 + " раза.");
	}

// определение значения стороны квадрата
	static double sideOfSquare(double d) {
		double sideOfSquare = Math.sqrt(d);
		return sideOfSquare;
	}

// определение площади вписанного квадрата
	static double areaOfSquare1(double d) {

		double areaOfSquare1 = Math.pow(Math.sqrt(Math.pow(d, 2) / 2), 2);
		return areaOfSquare1;
	}
}
