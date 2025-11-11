// Computes an approximation of PI.
public class CalcPi {
	public static void main(String[] args) {
		// Replace this comment with your code
		int numOfTerms = Integer.parseInt(args[0]);
		double pi = Math.PI;
		int denominator = 1;
		double sum = 0;

		for (int i = 0; i < numOfTerms; i++) {
			if (i % 2 != 0) {
				sum = sum - ((double) 1 / denominator);

			} else {
				sum = sum + ((double) 1 / denominator);

			}
			denominator = denominator + 2;
		}
		System.out.println("pi according to Java: " + pi);
		System.out.println("pi, approximated:     " + sum * 4);

	}
}
