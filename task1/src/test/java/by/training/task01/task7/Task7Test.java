package by.training.task01.task7;

import org.junit.Assert;
import org.junit.Test;

public class Task7Test {
	@Test

	public void closerToBeginning() {
		float a = 5;
		float b = 4;
		float c = 6;
		float d = 2;
		String expected = "Точка B находится ближе к началу координат.";
		String actual = Task7.closerToBeginning(a, b, c, d);
		Assert.assertEquals(expected, actual);

	}
}
