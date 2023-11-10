package time_and_space_complexity;

public class BubbleSort {

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

	public static void bubblesortAlgo(int[] arr) {

		for (int itr = 1; itr <= arr.length - 1; itr++) {

			for (int j = 0; j < arr.length - itr; j++) {

				if (isSmaller(arr, j + 1 ,j)) {
					swap(arr, j+1, j);
				}

			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 5, 9, 3, 2, 8, 10, 7 };

		bubblesortAlgo(arr);

		for (int val : arr) {
			System.out.print(val + " ");
		}

	}

}
