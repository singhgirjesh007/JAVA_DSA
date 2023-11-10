package functions_arrays;

import java.util.Scanner;

public class RotateAnArray {

	public static int[] reverseArray(int[] arr, int i, int j) {
		int li = i;
		int lj = j;
		while (li < lj) {
			arr[li] = arr[li] + arr[lj];
			arr[lj] = arr[li] - arr[lj];
			arr[li] = arr[li] - arr[lj];

			li++;
			lj--;
		}
		return arr;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[] b = new int[n];

		for (int i = 0; i < b.length; i++) {

			b[i] = scn.nextInt();
		}

		int k = scn.nextInt();

		// int[] b = {1,2,3,4,5};

		int l = b.length;

		if (k > l)
			k = k % l;

		if (k < 0) {
			k = l + k;
		}

		int p1 = l - k - 1;
		int p2 = l - k;

		reverseArray(b, 0, l - 1 - k);
		reverseArray(b, l - k, l - 1);

		reverseArray(b, 0, l - 1);

		for (int val : b) {
			System.out.print(val + " ");
		}

	}

}
