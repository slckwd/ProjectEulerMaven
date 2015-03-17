package euler;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProjectEuler001Test {
	static long actual;
	static long expected;

	@Test
	public void inputZeroReturnsZero() {
		actual = ProjectEuler001.solve(0);
		expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test
	public void inputOneReturnsZero() {
		actual = ProjectEuler001.solve(1);
		expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test
	public void inputThreeReturnsThree() {
		actual = ProjectEuler001.solve(3);
		expected = 3;
		assertEquals(expected, actual);
	}
	
	@Test
	public void inputFiveReturnsEight() {
		actual = ProjectEuler001.solve(5);
		expected = 8;
		assertEquals(expected, actual);
	}
	
	@Test
	public void inputNegativeReturnsNegative() {
		actual = ProjectEuler001.solve(-7);
		expected = -7;
		assertEquals(expected, actual);
	}
	
	
}
