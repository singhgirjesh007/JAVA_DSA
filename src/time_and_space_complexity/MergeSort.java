package time_and_space_complexity;

public class MergeSort {
	
	public static int[] mergeSort(int[] arr , int li , int hi) {
		
		if (li ==hi) {
			
			int[] ba = new int[1];
			ba[0] = arr[li];
			return ba;
			
		}
		
		int mid  = (li + hi)/2;
		
		int [] fsh = mergeSort(arr , li , mid);
		int [] ssh = mergeSort(arr , mid+1 , hi);
		int [] sortedArr = mergeTwoSortedArray(fsh , ssh);
		
		
		return sortedArr;
		
	}
	

	public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {

		int[] marr = new int[arr1.length + arr2.length];

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < arr1.length && j < arr2.length) {

			if (arr1[i] < arr2[j]) {
				marr[k] = arr1[i];
				i++;
				k++;
			} else {
				marr[k] = arr2[j];
				j++;
				k++;
			}

		}

		while (i < arr1.length) {
			marr[k] = arr1[i];
			i++;
			k++;
		}

		while (j < arr2.length) {
			marr[k] = arr2[j];
			j++;
			k++;
		}

		return marr;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,4,2,7,8,34,25,89,30};
		mergeSort(arr, 0, arr.length-1);
		
		for (int val : arr) {
			System.out.print(val + " ");
		}
		
	}

}
