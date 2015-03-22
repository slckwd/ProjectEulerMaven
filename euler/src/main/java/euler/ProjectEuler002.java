package euler;

public class ProjectEuler002 {
	public static long solve(double input) {
		if (input < 1) {
			return (long) input;
		}
		long[] fib = { 1, 2 };
		long solution = 0;
		while (fib[1] < input) {
			if (fib[1] % 2 == 0) {
				solution += fib[1];
			}
			long nextFib = fib[0] + fib[1];
			fib[0] = fib[1];
			fib[1] = nextFib;
		}
		return solution;
	}
}
