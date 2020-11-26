package by.training.task01.task6;

import org.junit.Assert;
import org.junit.Test;

public class Task6Test {
	@Test

	public void setHoursTest() {
		int s = 72000;
		int expected = 20;
		int actual = Task6.setHours(s);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void setMinutesTest() {
		int s = 10000;
		int h = 2;
		int expected = 46;
		int actual = Task6.setMinutes(s, h);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void setSeconds() {
		int s = 20000;
		int h = 5;
		int m = 33;
		int expected = 20;
		int actual = Task6.setSeconds(s, h, m);
		Assert.assertEquals(expected, actual);
	}
}
