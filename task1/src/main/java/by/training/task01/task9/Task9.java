package by.training.task01.task9;

//	Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
public class Task9 {

	public static void main(String[] args) {
		double radius = 28.5;

		System.out.println("Окружность круга равна: " + getCircle(radius));
		System.out.println("Площадь круга равна: " + getArea(radius));

	}

// определение окружности круга.
	static double getCircle(double radius) {

		double circle = 2 * Math.PI * radius;
		return circle;
	}

// определение площади круга.
	static double getArea(double radius) {

		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}

}
