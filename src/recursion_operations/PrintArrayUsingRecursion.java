package recursion_operations;

public class PrintArrayUsingRecursion {
	
	public static void printArrayRecursion (int[] arr , int indx) {
		
		if (indx > arr.length-1) {
			return;
		}
		
		System.out.println(arr[indx]);
		printArrayRecursion(arr, indx+1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {4,5,2,7,8,9};
		
		printArrayRecursion(arr, 0);
	}

}
