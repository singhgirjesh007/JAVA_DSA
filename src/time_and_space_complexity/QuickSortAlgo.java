package time_and_space_complexity;

public class QuickSortAlgo {

	public static void swap(int[] arr, int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	public static int partioningArray(int[] arr, int lo, int hi, int pivot) {

		int i = lo;
		int j = lo;

		while (i <= hi) {

			if (arr[i] > pivot) {
				i++;
			} else {
				swap(arr, i, j);
				i++;
				j++;

			}

		}

		return j - 1;

	}

	public static void quickSort(int [] arr , int lo , int hi ) {
		
		if (lo >=hi) {
			return;
		}
		
		
		int pivot = arr[hi];
		int pi = partioningArray(arr, lo, hi, pivot);
		quickSort(arr, lo, pi-1);
		quickSort(arr, pi+1, hi);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 12, 15, 35, 2, 8, 72, 9, 131, 1, 7 };
		int k = 7;

		quickSort(arr, 0, arr.length-1);

		for (int val : arr) {
			System.out.print(val + " ");
		}

	}

}
