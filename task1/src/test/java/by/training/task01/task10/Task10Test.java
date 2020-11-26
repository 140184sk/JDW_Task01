package by.training.task01.task10;
import org.junit.Test;
import org.junit.Assert;



public class Task10Test {
@Test

public void valueOfFunction () {
	float i = 2;
	float expected = -2.185f;
	float actual = Task10.valueOfFunction(i);
	Assert.assertEquals(expected, actual, 0.001);
	
}




}
