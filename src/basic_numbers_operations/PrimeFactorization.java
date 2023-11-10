package basic_numbers_operations;

import java.util.Scanner;

public class PrimeFactorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		
		for(int div =2; div*div <=num ;div++) {
				
				num = num/div;
				System.out.print(div +" ");
			}
		
	
	if (num !=1) {
		System.out.print(num);
	}		
		
		
		//int count =0; Wrong declartion of count as it's keep the old value
		
	/*	for (int j=2; j<=num; j++) {
			int count =0;
		
		for( int i= 2 ; i*i<=j; i++) {
			
			if(j%i == 0) { 
				count++;
				break;
			}
			
			
		}
		
		if (count == 0) {
			System.out.println(j);
		}
		} */

	}

}
