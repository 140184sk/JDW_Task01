package by.training.task01.task2;

import org.junit.Test;
import org.junit.Assert;

public class Task2Test {
	@Test
	public void yearIsLeapTest() {
		int y = 1984;
		
		boolean expected = true;
		
		boolean actual = Task2.yearIsLeap(y);
		
		Assert.assertEquals(expected, actual);
		
	}
	@Test
	public void monthCountDaysTest() {
		int m = 2;
		boolean b = true;
		String expected = "В Вашем месяце 29 дней";
		String actual = Task2.monthCountDays(m, b);
		Assert.assertEquals(expected, actual);
	}
	
}
