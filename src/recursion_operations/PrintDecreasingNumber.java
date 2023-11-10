package recursion_operations;

import java.util.Scanner;

public class PrintDecreasingNumber {
	
	public static void printDecreasing(int n) {
		if (n <0) {
			return;
		}
		System.out.println(n);
		printDecreasing(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		printDecreasing(n);
	}

}
