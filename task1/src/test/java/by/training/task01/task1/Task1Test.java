package by.training.task01.task1;

import org.junit.Test;
import org.junit.Assert;

public class Task1Test {
	@Test
	public void squareTest() {
		int a = 9;
		int expected = 1;
		int actual = Task1.square(a);
		Assert.assertEquals(expected, actual);
	}

}
