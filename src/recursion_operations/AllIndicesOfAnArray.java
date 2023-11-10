package recursion_operations;

public class AllIndicesOfAnArray {
	
	public static int allIndices(int[] arr , int idx , int k) {
		
		
		if (idx== arr.length) {
			return -1;
		}
		
		int occu = allIndices(arr, idx+1 , k);
		int temp ;
		
		if (occu == -1) {
			
			if (arr[idx] == k) {
				return idx;
			}
			else {
				return -1;
			}
		}
		else {
			return occu;
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1,2,3,4,5,3,2,1};
		

	}

}
