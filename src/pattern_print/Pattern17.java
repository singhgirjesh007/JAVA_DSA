package pattern_print;

import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int st = 1;
		
		for (int i = 1; i <= n; i++) {

			if (i == n / 2 + 1) {
				for (int j = 1; j <= n; j++) {
					System.out.print("*\t");
				}
			}

			else {

				
				int sp = n / 2;

				for (int k = 1; k <= sp; k++) {
					System.out.print("\t");
				}

				for (int k = 1; k <= st; k++) {
					System.out.print("*\t");
				}

				if (i < n / 2) {
					st++;
				} else if (i >= n / 2 + 2) {
					st--;
				}

				

			}
			System.out.println();
		}

	}

}
