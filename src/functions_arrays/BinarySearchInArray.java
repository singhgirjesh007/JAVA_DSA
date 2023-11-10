package functions_arrays;

public class BinarySearchInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a  = {1 ,2 ,3 ,4 ,5,6,7 ,8 , 9};
		int d = 12;
		int low =0;
		int high = a.length-1;
		
		
		
		
		while(low <= high) {
			 
			int mid = (low+high)/2;
			
			if(d < a[mid]) {
				high = mid-1;
				
			}
			
			else if (d > a[mid]) {
				low = mid+1;
				
			}
			
			else {
				System.err.println(mid);
				return;
			}	
				
		}
		
		System.out.println(-1);
	}

}
