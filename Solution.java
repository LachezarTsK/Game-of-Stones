import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfTestCases = scanner.nextInt();

		for (int i = 0; i < numberOfTestCases; i++) {
			int numberOfStones = scanner.nextInt();
			/**
			 * When the number of remaining stones is in the range from 2 to 6, whoever is
			 * on turn to move, wins.
			 * 
			 * Therefore, if the initial number of stones modulo 7 is in this range, 
      			 * the first player can always make moves that will eventually lead to 
      			 * remaining stones in the range from 2 to 6, with the first being on turn to move.
			 */
			System.out.println((numberOfStones % 7 > 1) ? "First" : "Second");
		}
		scanner.close();
	}
}
