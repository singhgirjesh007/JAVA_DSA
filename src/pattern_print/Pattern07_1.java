package pattern_print;

import java.util.Scanner;

public class Pattern07_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
		
		int st =1 ;
		int sp = 0 ;
		
		for(int i = 1 ; i <= n ; i++) {
			
			for(int j =1 ; j<=sp ;j++) {
				System.out.print("_\t");
			}
			
			System.out.print("*\t");
			
			sp++;
			System.out.println();
		}
			
	}

}
