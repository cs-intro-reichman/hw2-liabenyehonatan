/*
Feedback:
Great work!
Yam
*/




// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int N = Integer.parseInt(args[0]);
		String mode = args[1];

		for (int seed = 1; seed <= N; seed++) {
			int num = seed;
			int steps = 1;
			if (mode.equals("v")) {
				System.out.print(num);

			}

			while (true) {
				if (num % 2 == 0) {
					num = num / 2;
				} else {
					num = num * 3 + 1;
				}
				steps++;
				if (mode.equals("v")) {
					System.out.print(" " + num);
				}

				if (num == 1) {
					break;
				}
			}
			if (mode.equals("v")) {
				System.out.println(" (" + steps + ")");
			}

		}
		if (mode.equals("c") || mode.equals("v")) {
			System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
		}
	}

}

