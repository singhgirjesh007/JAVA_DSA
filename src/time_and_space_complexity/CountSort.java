package time_and_space_complexity;

public class CountSort {

	public static void countSort(int[] arr) {

		int min = arr[0];
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}

			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(min + " " + max);
		
		int range = max - min +1;
		
	int [] freq = new int[range];
	
	
	
	for (int i =0 ; i<arr.length ;i++) {
		
		  int indx = arr[i] - min;
		  freq[indx]++;
		
	}
	
	int[] arr2 = new int[arr.length];
	
/*	int j =0;
	for (int i =0  ; i < freq.length ;i++) {
		while (freq[i] > 0) {
			arr2[j] = i+min ;
			j++;
			freq[i]--;	
		}		
	}
	
	System.out.println(" print without stable sort ");
	
	for (int val : arr2) {
		System.out.print(val + " ");
	} */
	System.out.println();
	System.out.println("covert frequecy arr to prefix sum index");
	for (int i =1 ; i<freq.length ;i++) {
		
		freq[i] = freq[i]+ freq[i-1];
	}
	
	int[] ans = new int[arr.length];
	
	
	for (int i = arr.length-1 ; i>=0 ;i--) {
		int val = arr[i];
		int pos = freq [val-min];
		int indx = pos-1;
		ans[indx] = val;
		freq[val-min]--;
		
		
	}
	
	System.out.println("print stable sor array");
	
	for (int val : ans) {
		System.out.print(val + " ");
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {3,4,5,6,3,4,8,9,5,9,2,1,3,6,6,6,9};
		countSort(arr);
		

	}

}
