package euler;

public class PrimeChecker {

	public static boolean isPrime(long input) {
		if (input < 2) {
			return false;
		}
		if (input == 2) {
			return true;
		}
		for (long i = 2; i <= Math.sqrt(input); i++) {
			if (input % i == 0) {
				return false;
			}
		}
		return true;
	}
}