package basic_doubts;

public class AllIndicesOfAnArray {
	
	public static int[] allIndices(int[] arr , int idx , int k , int fsf) {
		
		int temp =0 ;
		
		if (idx== arr.length) {
			return new int[fsf];
		}
		
		if (arr[idx] == k) {
			int[] iarr = allIndices(arr, idx+1 , k ,fsf+1);
			iarr[fsf] = idx;
			return iarr;
		//	temp ++; // unreachable code why
		}else {
			int[] iarr = allIndices(arr, idx+1 , k ,fsf);
			return iarr;
		}
		
		
			
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1,2,3,4,5,3,2,1};
		
		int[] iarr = allIndices(arr, 0, 3, 0);
		for(int val : iarr) {
			System.out.print(val + " ");
	}

}
	}
