package functions_arrays;

import java.util.Scanner;

public class SubArrayOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * {a,b ,c }
		 * 
		 * a - a b - a b c - b - b c - c
		 * 
		 */

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int[] a = new int[n];

		for (int i = 0; i < a.length; i++) {
			a[i] = scn.nextInt();
		}

		for (int i = 0; i < a.length; i++) {

			for (int j = i; j < a.length; j++) {

				for (int k = i; k <= j; k++) {

					System.out.print(a[k] + " ");
				}

				System.out.println();
			}

		}

	}
}
