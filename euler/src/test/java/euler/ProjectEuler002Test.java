package euler;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProjectEuler002Test {
	long actual;
	long expected;

	@Test
	public void inputZeroReturnZero() {
		actual = ProjectEuler002.solve(0);
		expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test
	public void inputOneReturnZero() {
		actual = ProjectEuler002.solve(1);
		expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test
	public void inputThreeReturnsTwo() {
		actual = ProjectEuler002.solve(3);
		expected = 2;
		assertEquals(expected, actual);
	}
	
	@Test
	public void inputNineReturnsTen() {
		actual = ProjectEuler002.solve(9);
		expected = 10;
		assertEquals(expected, actual);
	}
	
	@Test
	public void inputNegativeReturnsNegative() {
		actual = ProjectEuler002.solve(-7);
		expected = -7;
		assertEquals(expected, actual);
	}

}
