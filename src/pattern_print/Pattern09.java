package pattern_print;

import java.util.Scanner;

public class Pattern09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		for(int i = 1;  i<= n ; i++) {
			
			for(int j = 1 ; j<= n ;j++) {
				
				if(i == j )
					System.out.print("*\t");
				else if ( i+j == n+1 )
					System.out.print("*\t");
				else
					System.out.print("\t");
				
			}
			System.out.println();
		}

	}

}
