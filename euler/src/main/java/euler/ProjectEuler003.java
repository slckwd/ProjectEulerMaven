package euler;

public class ProjectEuler003 {

	public static long solve(long input) {
		if (input < 1) {
			return input;
		}
		long solution = input;
		for (long i = 3; i < Math.sqrt(input); i += 2) {
			if (input % i == 0) {
				if (PrimeChecker.isPrime(input / i)) {
					solution = input / i;
				} else if (PrimeChecker.isPrime(i)) {
					solution = i;
				}
			}
		}
		return solution;
	}
}
