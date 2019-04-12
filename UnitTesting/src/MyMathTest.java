import static org.junit.Assert.*;

import org.junit.Test;

public class MyMathTest {

	@Test
	public void test() {
		MyMath math = new MyMath(8, 10);
	    assertEquals(18, math.practice());	}

}