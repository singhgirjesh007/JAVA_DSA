package functions_arrays;

public class FirstAndLastIndex {

	/*
	 * first index and last index sorted array duplicate element
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 10, 10, 10, 20, 20, 20, 20, 20, 20, 20, 20, 20, 30, 30, 30, 40, 40, 40, 50, 50, 50 };

		int d = 20;
		
		int l = 0;
		int h = a.length - 1;
		int hIndx = 0;
		int lIndx = 0;
		int mid =0;

		while (l <= h) {

			 mid = (l + h) / 2;

			if (d < a[mid]) {
				h = mid - 1;
			}

			else if (d > a[mid]) {

				l = mid + 1;
			}

			else {
				hIndx = mid;
				l = mid + 1;
			}
		}
		
		
		l =0 ;
		h = a.length-1;
		
		while (l <= h) {

			mid = (l + h) / 2;

			if (d < a[mid]) {
				h = mid - 1;
			}

			else if (d > a[mid]) {

				l = mid + 1;
			}

			else {
				lIndx = mid;
				h = mid - 1;
			}
		}

		System.out.println(lIndx + " " + hIndx);

	}

}
