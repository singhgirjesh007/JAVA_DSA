package basic_numbers_operations;

import java.util.Scanner;

public class PrimeNumberInRange {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int low = scn.nextInt();
		int high = scn.nextInt();

		if (low < 2 || high > 1000000) {
			System.out.println("invalid input");
		} else {

			while (low <= high) {
				int count = 0;
				for (int i = 2; i * i <= low; i++) {

					if (low % i == 0) {
						count++;
						break;
					}

				}

				if (count == 0) {
					System.out.println(low);
				}
				low++;

			}

		}

	}
}
