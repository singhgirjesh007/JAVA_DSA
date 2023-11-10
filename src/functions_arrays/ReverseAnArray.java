package functions_arrays;

import java.util.Scanner;

public class ReverseAnArray {
	
	public static int[] reverseArray(int[] arr) {
		
		int i=0;
		int j = arr.length-1;
		
		while(i<j) {
			
			arr[i] = arr[i]+arr[j];
			arr[j] = arr[i] - arr[j];
			arr[i]= arr[i] - arr[j];
			
			i++;
			j--;
		} 
	
		return arr;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int[] a = new int[n];
		
		for(int i =0 ; i<a.length ; i++) {
			
			a[i] = scn.nextInt();
		}
		
		reverseArray(a);
		
		for(int val : a) {
			System.out.print(val + " ");
		}
		
	/*	int i =0;
		int j = a.length -1;
		
		
		while (i< j) {
			
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			
			i++;
			j--;
			
		}
		
		for(int val : a) {
			System.out.print(val + " ");
		}
	*/
	}

}
