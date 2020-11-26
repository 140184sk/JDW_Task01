package by.training.task01.task9;

import org.junit.Assert;
import org.junit.Test;

public class Task9Test {
	@Test

	public void getCircle() {

		double d = 5;

		double expected = 31.41592;
		double actual = Task9.getCircle(d);
		Assert.assertEquals(expected, actual, 0.0001);

	}

	@Test
	public void getArea() {
		double d = 12;
		double expected = 452.389;
		double actual = Task9.getArea(d);
		Assert.assertEquals(expected, actual, 0.001);
	}

}
