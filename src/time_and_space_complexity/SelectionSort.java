package time_and_space_complexity;

public class SelectionSort {

	public static void swap(int[] arr, int i, int j) {

		System.out.println("swapping " + arr[i] + "and " + arr[j]);
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	public static boolean isSmaller(int[] arr, int i, int j) {
		System.out.println("comparing  " + arr[i] + "and " + arr[j]);
		if (arr[i] < arr[j])
			return true;
		else
			return false;
	}

	public static void selectSort(int[] arr) {

		for (int itr = 0; itr < arr.length - 1; itr++) {
			int min = itr;
			for (int j = itr + 1; j <= arr.length - 1; j++) {

				if (isSmaller(arr, j, min)) {
					min = j;
				}

			}
			swap(arr, min, itr);

		}

		System.out.println();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 5, 9, 3, 2, 8, 10, 7 };

		selectSort(arr);

		for (int val : arr) {
			System.out.print(val + " ");
		}
	}

}
