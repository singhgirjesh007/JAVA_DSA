package basic_numbers_operations;

import java.util.Scanner;

public class RotateANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Rotate a number by 2 , 3 ,4 or -1 , -2 ...352 times
		 */

		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int k = scn.nextInt();

		int temp = num;
		int count = 0;
		//logic to count digit
		while (temp != 0) {
			temp = temp / 10;
			count++;
		}
		
		if (k < 0) {
			k = count + k;
		}

		if (k > count) {
			k = k % count;
		}
		
		
	//	Logic to get Multiplier and divisor
	/*
	 * int mult = (int) Math.pow(10, count - k);
	 *  int div = (int) Math.pow(10, k);
	 */
		int mult =1;
		int div =1;
		for(int i =1; i<= count; i++) {
			if(i<=k) {
				div = div*10;
			}
			else
				mult = mult*10;
			
		}
		
		//System.out.println(mult + " " + div);

		int quo = num % div;
		int rem = num / div;

		int rot = (quo * mult) + rem;

		System.out.println(rot);

	}

}
