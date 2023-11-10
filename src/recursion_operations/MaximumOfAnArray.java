package recursion_operations;

public class MaximumOfAnArray {
	
	public static int  maxArr (int[] arr , int idx) {
		
		if (idx == arr.length-1) {
			return arr[idx];
		}
		
		int max_smallarray =maxArr(arr , idx+1);
		if (arr[idx] >max_smallarray ) {
			return arr[idx];
		}
		else {
			return max_smallarray;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {23,44,54,78,2,1,99,5,8,2};
		System.out.println(maxArr(arr, 0));
	}

}
