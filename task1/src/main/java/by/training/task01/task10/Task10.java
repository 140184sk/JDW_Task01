package by.training.task01.task10;

// Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. 
//Результат представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие значения функции.
// F(x) = tg(x);
public class Task10 {

	public static void main(String[] args) {
		float a = 2f;
		float b = 9f;
		float h = 0.2f;

		System.out.println("   Значение аргумента  Значение функции");
		System.out.println();
		printTable(a, b, h);

	}

// определение значения функции.
	static float valueOfFunction(float i) {
		float valueOfFunction = (float) Math.tan(i);
		return valueOfFunction;
	}

// вывод таблицы в консоль.
	static void printTable(float a, float b, float h) {
		for (float f = a; f <= b; f = f + h) {
			System.out.printf("%15s %20s", f, valueOfFunction(f));
			System.out.println();
		}
	}

}