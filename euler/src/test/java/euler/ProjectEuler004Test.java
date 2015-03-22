package euler;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProjectEuler004Test {
	long actual;
	long expected;
	
	@Test
	public void inputZeroReturnsZero() {
		actual=ProjectEuler004.solve(0);
		expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test
	public void inputThreeReturnsNine() {
		actual=ProjectEuler004.solve(3);
		expected = 9;
		assertEquals(expected, actual);
	}
	
	@Test
	public void inputNinetyNineReturnsNineThousandNine() {
		actual=ProjectEuler004.solve(99);
		expected = 9009;
		assertEquals(expected, actual);
	}
	
	@Test
	public void inputNegativeReturnsNegative() {
		actual=ProjectEuler004.solve(-7);
		expected = -7;
		assertEquals(expected, actual);
	}

}
