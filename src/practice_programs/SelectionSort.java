package practice_programs;

public class SelectionSort {
	
	public static void swap(int[] arr , int i , int j) {
	
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
	
		
	}
	
	public static void selectionSort(int[] arr){
	
	
	for(int i =0 ;  i < arr.length-1 ; i++){
		int min = arr[i];
		int idx_min =i;
		for(int j =i+1 ;j<arr.length ;j++) {
			
			if (min > arr[j]){
			min = arr[j];
			idx_min =j;
			}

		}
		swap (arr , i , idx_min);
	
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 2,5,1,7,9,10,12,4};
		
		selectionSort(arr);
		
		for(int val : arr) {
		System.out.print(val + " ");
		}

	}

}
