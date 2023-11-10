package time_and_space_complexity;

public class PartioningArray {
	
	public static void swap(int[] arr , int i , int j) {
		
		System.out.println("swapping " + i +  " and " + j + " places values.");
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//0  to j-1 less than pivot
		//j to i-2 greater than pivot
		//i to end unknown
		int arr[] = {8,5,1,3,7,2,9,6};
		int k = 6;
		int i = 0;
		int j = 0;
		
		while (i < arr.length) {
			
			if (arr[i] > k) {
				i++;
			}else {
				swap(arr , i , j);
				i++;
				j++;
				
			}
		}
		
		for (int count = 0 ; count<=j-1 ;count ++) {
			System.out.print(arr[count] + " ");
			
		}
		
		System.out.println();
		
		for (int count = j ; count <arr.length ; count ++) {
			System.out.print(arr[count] + " ");
			
		}
		

	}

}
