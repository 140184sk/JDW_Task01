package by.training.task01.task8;

import org.junit.Test;
import org.junit.Assert;

public class Task8Test {
	@Test

	public void valueOfFunction() {
		double d = 5;
		double expected = -1;
		double actual = Task8.valueOfFunction(d);
		Assert.assertEquals(expected, actual, 0.000001);
	}

}
