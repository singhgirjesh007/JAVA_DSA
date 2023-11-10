package time_and_space_complexity;

public class InsertionSort {
	
	public static void swap (int[] arr , int i , int j) {
		
		System.out.println("swapping " + arr[i] + " and " + arr[j]);
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
	
	public static boolean isGreater(int[ ] arr , int i , int j) {
		
		if (arr[i] > arr[j]) {
			return true;
		}
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 9, 3, 2, 8, 10, 7 };
		
		for (int itr =1 ; itr <= arr.length-1 ; itr ++) {
			
			for (int j = itr-1 ; j>=0 ; j--) {
				
				if (isGreater(arr , j ,j+1)) {
					swap(arr,j,j+1);
				}
			}
			
			
			
		}
		
		for(int val : arr) {
			System.out.print(val + " ");
		}
	}

}
