package pattern_print;

import java.util.Scanner;

public class Pattern03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
		
		int sp = n-1;
		int st = 1;
		
		for(int i = 1; i<=n ; i++) {
		
			
			for(int j=1 ; j<= sp ; j++) {
				System.out.print("\t");
			}
			
			for(int j=1 ; j<=st ; j++) {
				System.out.print("*\t");
			}
			
			
			sp--;
			st++;
			
			
			System.out.println();
			
			
		}

	}

}
