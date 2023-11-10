package time_and_space_complexity;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 2, 4, 8, 14, 17};
		int[] b = { 5, 7, 10, 18, 20, 22, 44 };

		int sz = a.length + b.length;
		int min, max = 0;

		if (a.length > b.length) {
			max = a.length;
			min = b.length;
		} else {
			max = b.length;
			min = a.length;
		}

		int[] c = new int[sz];

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < a.length && j < b.length) {

			if (a[i] > b[j]) {
				c[k] = b[j];
				j++;
				k++;
			} else {
				c[k] = a[i];
				i++;
				k++;
			}
		}

		while (i < a.length) {

			c[k] = a[i];
			i++;
			k++;
		}

		while (j < b.length) {

			c[k] = b[j];
			k++;
			j++;
		}

		for (int val : c) {
			System.out.println(val + " ");
		}
	}

}
