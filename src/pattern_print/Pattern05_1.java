package pattern_print;

import java.util.Scanner;

public class Pattern05_1 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int sp = n / 2;
		int st = 1;

		for (int i = 1; i <= n / 2 + 1; i++) {

			for (int j = 1; j <= sp; j++) {
				System.out.print("\t");
			}

			for (int j = 1; j <= st; j++) {
				System.out.print("*\t");
			}

		
			if (sp > 0) {
				sp--;
			}

			if (st < n) {
				st = st + 2;
			}

			System.out.println();

		}

		for (int i = n / 2; i > 0; i--) {

			if (sp >= 0) {
				sp++;
			}

			if (st <= n) {
				st = st - 2;
			}

			for (int j = 1; j <= sp; j++) {
				System.out.print("\t");
			}

			for (int j = 1; j <= st; j++) {
				System.out.print("*\t");
			}

		

			System.out.println();

		}

		// TODO Auto-generated method stub

	}

}
