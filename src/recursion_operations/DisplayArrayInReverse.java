package recursion_operations;

public class DisplayArrayInReverse {
	
	public static void displayArrayReverse(int [] arr , int indx) {
		
		if (indx > arr.length-1) {
			return;
		}
		
		
		displayArrayReverse(arr, indx+1);
		System.out.println(arr[indx]);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {4,5,2,8,9,10,11};
		
		displayArrayReverse(arr, 0);
	}

}
