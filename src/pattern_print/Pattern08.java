package pattern_print;

import java.util.Scanner;

public class Pattern08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
	
		for(int i = 1 ; i<=n ; i++) {
			
			
			for( int j =1 ; j<= n ; j++) {
				
				if (i+j == n+1 ) {
					
					System.out.print("*\t");
				}
				else {
					System.out.print("\t");
				}
			}
			
			System.out.println();
		}
		
		
		
		
	// SPace and star logic value
		
	/*	int st =1 ;
		int sp = n-1 ;
		
		for(int i = 1 ; i <= n ; i++) {
			
			for(int j =1 ; j<=sp ;j++) {
				System.out.print("\t");
			}
			
			System.out.print("*\t");
			
			sp--;
			System.out.println();
		}
 */
	}

}
