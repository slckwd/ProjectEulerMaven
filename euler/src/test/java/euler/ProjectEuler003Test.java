package euler;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProjectEuler003Test {
	long actual;
	long expected;
	
	@Test
	public void inputZeroReturnsZero() {
		actual = ProjectEuler003.solve(0);
		expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test
	public void inputTwoReturnsTwo() {
		actual = ProjectEuler003.solve(2);
		expected = 2;
		assertEquals(expected, actual);
	}
	
	@Test
	public void inputFifteenReturnsFive() {
		actual = ProjectEuler003.solve(15);
		expected = 5;
		assertEquals(expected, actual);
	}
	
	@Test
	public void inputNegativeReturnsNegative() {
		actual = ProjectEuler003.solve(-7);
		expected = -7;
		assertEquals(expected, actual);
	}

}
