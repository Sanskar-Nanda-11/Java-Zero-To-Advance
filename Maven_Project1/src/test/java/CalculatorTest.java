import static org.junit.Assert.*;

import org.junit.Test;

import com.besat.packages.java.Calculate;

public class CalculatorTest {

	@Test
	public void test() {
//		fail("Not yet implemented");
		int result = Calculate.add(1, 2);
		assertEquals(result, 3); //will pass only if result is equal to 3
	}
	
	@Test
	public void testaddnegetive() {
		int result = Calculate.add(1, 2);
		assertNotEquals(result, 9); // this will pass if result is not equal to 3
	}

}
