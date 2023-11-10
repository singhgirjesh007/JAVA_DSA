package pattern_print;

import java.util.Scanner;

public class Pattern04 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int sp = 0;
		int st = n;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= sp; j++) {
				System.out.print("\t");
			}

			for (int j = 1; j <= st; j++) {

				System.out.print("*\t");
			}

			System.out.println();
			sp++;
			st--;

		}

	}

}
