package euler;

public class ProjectEuler005 {
	public static long solve(int input) {
		if (input < 1) {
			return input;
		}
		boolean solved = false;
		long solution = input;
		while (!solved) {
			out: for (int i = 1; i < input + 1; i++) {
				if (solution % i != 0) {
					solution++;
					break out;
				} else if (i == input) {
					solved = true;
				}
			}
		}
		return solution;
	}
}
