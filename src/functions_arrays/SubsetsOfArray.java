package functions_arrays;

import java.util.Scanner;

public class SubsetsOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int[] a = new int[n];

		for (int i = 0; i < a.length; i++) {
			a[i] = scn.nextInt();
		}

		int limit = (int)Math.pow(2,a.length);
		
			
			for(int i = 0 ; i< limit ; i++) {
				int temp =i;
				
				for(int j = 0; j<a.length ; j++) {
					
					int r = temp%2;
					temp=temp/2;
					
					if(r ==0 ) {
						System.out.print("-\t");
					}
					else
						System.out.print(a[j] +"\t");
				}
			System.out.println();
		}
		
		
	}

}
