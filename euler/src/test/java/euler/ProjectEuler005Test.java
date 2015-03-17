package euler;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProjectEuler005Test {
	static long expected;
	static long actual;

	@Test
	public void inputZeroReturnsZero() {
		actual = ProjectEuler005.solve(0);
		expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test
	public void inputTwoReturnsTwo() {
		actual = ProjectEuler005.solve(2);
		expected = 2;
		assertEquals(expected, actual);
	}
	
	@Test
	public void inputThreeReturnsSix() {
		actual = ProjectEuler005.solve(3);
		expected = 6;
		assertEquals(expected, actual);
	}
	
	@Test
	public void inputNegativeReturnsNegative() {
		actual = ProjectEuler005.solve(-7);
		expected = -7;
		assertEquals(expected, actual);
	}

}
