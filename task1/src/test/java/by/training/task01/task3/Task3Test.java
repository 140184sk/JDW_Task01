package by.training.task01.task3;

import org.junit.Test;
import org.junit.Assert;

public class Task3Test {
	@Test

	public void sideOfSquareTest() {
		double d = 144;
		double expected = 12;
		double actual = Task3.sideOfSquare(d);
		Assert.assertEquals(expected, actual, 0);

	}

	@Test
	public void areaOfSquare1Test() {
		double a = 12;
		double expected = 71.9;
double actual = Task3.areaOfSquare1(a);
Assert.assertEquals(expected, actual, 0.1);
	}

}
