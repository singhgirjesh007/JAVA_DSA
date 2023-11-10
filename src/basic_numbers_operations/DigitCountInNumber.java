package basic_numbers_operations;

import java.util.Scanner;

public class DigitCountInNumber {

	public static void main(String[] args) {

		/**
		 * Number of digit in a given number Print digit from right to left
		 */

		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int temp = num;
		int count = 0;

		while (temp != 0) {
			int quo = temp / 10;
			temp = quo;
			count++;

		}

		System.out.println("Number of Digit in a given number " + count);

		int div = (int) Math.pow(10, count - 1);

	//	while (num != 0)  - Number con

		System.out.println(0/1);
		
		while (div != 0) {
			int quo = num / div;
			System.out.print(quo + " ");
			num = num % div;
			div = div / 10;
		}

	}

}
