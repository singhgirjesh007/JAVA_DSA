package recursion_operations;

import java.util.Scanner;

// PDI(5)  5, 4,3 ,2 ,1 , 1,2,3,4,5

public class PrintDecreasingIncreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
	}
	
	
	public static void printIncreasingDecrasing(int n) {
		
		if (n ==0) {
			return;
		}
		
		System.out.println(n);
		printIncreasingDecrasing(n-1);
		System.out.println(n);
			
		}
		
		
	

}
