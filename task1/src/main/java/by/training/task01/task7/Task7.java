package by.training.task01.task7;

//	Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится ближе к началу координат. x y.

public class Task7 {

	public static void main(String[] args) {

		float x1 = -4;
		float y1 = 3;
		float x2 = 3;
		float y2 = 4;

		System.out.println(closerToBeginning(x1, y1, x2, y2));

	}

//определение числа, которое находится ближе к началу координат.
	static String closerToBeginning(float a, float b, float c, float d) {
		float z1 = (float) Math.sqrt(a * a + b * b);
		float z2 = (float) Math.sqrt(c * c + d * d);

		if (z1 < z2) {
			return "Точка А находится ближе к началу координат.";
		} else if (z1 > z2) {
			return "Точка B находится ближе к началу координат.";
		} else

			return "Точки А и B находятся на одном расстоянии до начала координат.";

	}
}
