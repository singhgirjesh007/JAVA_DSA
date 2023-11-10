package basic_numbers_operations;

import java.util.Scanner;

public class FibonacciNumbers {
	
	public static void main (String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		// 0 1 1 2 3 5 8 13 21 ......
		
		int n1 =0 ;
		int n2 =1;
		int temp;
		
		/*
		 * int temp ;
		 *  System.out.println(n1); 
		 *  System.out.println(n2); 
		 *  
		 *  for(int i=1 ; i<n-1;i++) { 
		 * 
		 * temp = n2; 
		 * n2 = n1+n2; 
		 * n1 = temp; 
		 * System.out.println(n2);
		 * 
		 * 
		 * }
		 */
		
		for(int i=0 ; i< n; i++) {
			
			System.out.println(n1);
			temp = n1+n2;
			n1= n2;
			n2=temp;
				
		}
		
		
	}

}
