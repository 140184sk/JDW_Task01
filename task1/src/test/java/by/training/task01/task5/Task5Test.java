package by.training.task01.task5;

import org.junit.Assert;
import org.junit.Test;

public class Task5Test {

	@Test
	public void sumOfDividersTest() {
		int n = 28;
		int expected = 28;
		int actual = Task5.sumOfDividers(n);
		Assert.assertEquals(expected, actual);
	}

	@Test

	public void isPerfectNumberTest() {
		int n = 28;
		int m = 28;
		boolean expected = true;
		boolean actual = Task5.isPerfectNumber(n, m);
		Assert.assertEquals(expected, actual);
	}

}
