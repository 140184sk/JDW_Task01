package by.training.task01.task4;

import org.junit.Test;
import org.junit.Assert;

public class Task4Test {
@Test

public void twoEvenTest() {
	int a = 23;
	int b = 144;
	int c = 2;
	int d = 9;
	boolean expected = true;
	boolean actual = Task4.twoEven(a, b, c, d);
	Assert.assertEquals(expected, actual);
			
}


}
