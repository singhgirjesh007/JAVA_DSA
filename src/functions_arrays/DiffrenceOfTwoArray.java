package functions_arrays;

import java.util.Scanner;

public class DiffrenceOfTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();

		int n2 = scn.nextInt();

		int[] a1 = new int[n1];
		int[] a2 = new int[n2];

		for (int i = 0; i < a1.length; i++) {

			a1[i] = scn.nextInt();
		}

		for (int i = 0; i < a2.length; i++) {

			a2[i] = scn.nextInt();
		}

		int[] diff = new int[n1];

		int i = n1 - 1;
		int j = n2 - 1;
		int k = n1 - 1;

		int c = 0;
		int d = 0;

		while (i >= 0) {

			int aval = j >= 0 ? a2[j] : 0;

			a1[i] = a1[i] + c;

			if (a1[i] >= aval) {
				d = a1[i] - aval;
			} else {
				d = a1[i] + 10 - aval;
				c = -1;
			}

			diff[i] = d;

			i--;
			j--;

		}
		
		for(int val : diff) {
			System.out.print(val + " ");
		}
		
		System.out.println();
		
		int indx = 0;
		while(indx < diff.length) {
			
			if(diff[indx] == 0) {
				indx++;
			}
			else {
				break;
			}
		}
		
		int temp = indx;
		System.out.println(temp);
		
		while(indx <diff.length) {
			System.out.print(diff[indx] + " ");
			indx++;
			
		}
		
		System.out.println();
		for (int i1 = temp ; i1 < diff.length ; i1++) {
			System.out.print(diff[i1] + " ");
		}

	}

}
