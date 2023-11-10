package functions_arrays;

public class SpanOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Span of array means maxium - minimum element
		 * 
		 */
		
		int[] arr ;
		
		arr = new int[6];
		
		arr[0] = 21;
		arr[1] = 5;
		arr[2] = 3;
		arr[3] = 40;
		arr[4] = 7;
		arr[5] = 90;
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i =0 ; i<arr.length ; i++) {
			
			if(arr[i]> max) {
				max = arr[i];
			}
			
			if(arr[i]< min) {
				min = arr[i];
			}
			
		}
		
		System.out.println( max-min);
		
	}

}
