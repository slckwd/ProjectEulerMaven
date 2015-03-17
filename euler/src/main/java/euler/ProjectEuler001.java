package euler;

public class ProjectEuler001 {
	public static long solve(int input) {
		if (input < 1) {
			return input;
		}
		long solution = 0;
		for (int i = 2; i < input + 1; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				solution += i;
			}
		}
		return solution;
	}
}