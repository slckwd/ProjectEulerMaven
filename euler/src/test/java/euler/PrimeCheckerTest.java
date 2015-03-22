package euler;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeCheckerTest {
	boolean actual;
	boolean expected;
	
	@Test
	public void inputZeroReturnFalse() {
		actual = PrimeChecker.isPrime(0);
		expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void inputTwoReturnsTrue() {
		actual = PrimeChecker.isPrime(2);
		expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void inputThreeReturnsTrue() {
		actual = PrimeChecker.isPrime(3);
		expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void inputFourReturnsFalse() {
		actual = PrimeChecker.isPrime(4);
		expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void inputNineReturnsFalse() {
		actual = PrimeChecker.isPrime(9);
		expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void inputNegativeReturnsFalse() {
		actual = PrimeChecker.isPrime(-7);
		expected = false;
		assertEquals(expected, actual);
	}

}
