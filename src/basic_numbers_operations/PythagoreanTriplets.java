package basic_numbers_operations;

import java.util.Scanner;

public class PythagoreanTriplets {
	
	public static void main (String[] args) {
		
		Scanner scn = new Scanner (System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		int max =a;
		
		if(b>= max) {
			max = b;
		}
		
		if (c>= max) {
			max =c;
		}
		
		if(max == a) {
		boolean flag =	(a*a)== (b*b + c*c) ;
		System.out.println(flag);
			
		}
		
		else if (max == b) {
			boolean flag =	(b*b)== (a*a + c*c) ;
			System.out.println(flag);
			
		}
		
		else {
			boolean flag =	(c*c)== (a*a + b*b) ;
			System.out.println(flag);
		}
		
	}

}
