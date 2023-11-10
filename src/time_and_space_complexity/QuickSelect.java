package time_and_space_complexity;

public class QuickSelect {
	
public static void swap(int[] arr , int i , int j) {
		
		System.out.println("swapping " + i +  " and " + j + " places values.");
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Kth Smallest element
		
		

	}

}
