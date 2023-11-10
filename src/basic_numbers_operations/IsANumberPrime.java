package basic_numbers_operations;

import java.util.Scanner;

public class IsANumberPrime {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt();
		
		
		for (int i = 1; i <= t; i++) {

			int n = scn.nextInt();
			int flag =0;
			

			if (n == 1)
				System.out.println("not prime");
			
			// loop should not execute till n as it should execute root n only 

			for (int i1 = 2; i1 * i1 <= n ; i1++) 
			{
				if (n % i1 == 0) {
					flag++;
					break;
				}

			}

			if (flag >= 1) {
				System.out.println(" not prime");
			} else
				System.out.println(" prime");

		}

	}
}
