package pattern_print;

import java.util.Scanner;

public class Pattern07_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
		
		
		for(int i=1 ; i<=n ; i++) {
			
			
			for (int j=1 ; j<=n ; j++) {
				
				if(i == j)
					System.out.print("*");
				else if(j<i)
					System.out.print("\t");
				
			}
			
			System.out.println();
		}

	}

}
