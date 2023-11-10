package recursion_operations;

public class FirstIndexOfOccurance {
	
	
	public static int firstIndexOfOccurance(int[] arr , int indx , int k) {
		if (indx == arr.length) {
			return -1;
		}
		
		if (k == arr[indx]) {
			return indx;
		}
		else {
		int fiocc =firstIndexOfOccurance(arr, indx+1, k);
			return fiocc;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1 ,2,3,5,7,8,9,10,3,2,5,8};
		int n =firstIndexOfOccurance(arr,0,5);
		System.out.println(n);
	}

}
