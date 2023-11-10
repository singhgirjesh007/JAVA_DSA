package functions_arrays;

import java.util.Scanner;

public class BarChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int[] a  = new int[n];
		
		for(int i= 0 ; i< a.length ; i++) {
			a[i] = scn.nextInt();	
		}
		 
	
		
	/*	int[] a  = new int[5];
		a[0] = 6;
		a[1]=1;
		a[2] = 4;
		a[3] = 0;
		a[4] = 2;
	*/	
		int max = a[0];
		
		for(int i =0 ; i<a.length ; i++) {
			
			if(a[i] > max) {
				max =a[i];
			}
		}
		
		for(int j = max ; j >0 ; j--) {
			
			for(int i =0 ; i< a.length ; i++) {
				
				if( j <= a[i]) {
					
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			
			System.out.println();
		}
		
		

	}

}
