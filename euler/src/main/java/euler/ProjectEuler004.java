package euler;

public class ProjectEuler004 {

	public static long solve(long input) {
		if (input < 1) {
			return input;
		}
		long solution = 0;
		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= input; j++) {
				long product = i * j;
				String productString = Long.toString(product);
				String productReverse = new StringBuilder(productString)
						.reverse().toString();
				if (productString.equals(productReverse) && product > solution) {
					solution = product;
				}
			}
		}
		return solution;
	}
}
