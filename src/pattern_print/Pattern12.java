package pattern_print;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		
		
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int n1 = 0;
		int n2 = 1;
		
		for(int i = 1 ; i<=n ;i++) {
			
			
			for(int j=1 ; j<=i ; j++) {
				
				System.out.print(n1+"\t");
				
				int temp =  n2 ;
				n2 = n1+n2;
				n1 = temp;	
				
			}
			
			System.out.println();
		}
		

	}

}
