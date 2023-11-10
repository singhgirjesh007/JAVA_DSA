package pattern_print;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		
		// Pattren n number of input
		
		int sp = 2*num-3;
		int val =1 ;
		
		
		
		
		for(int i = 1; i<=num ; i++) {	
			if (i < num) {
				
				int rval =1;
				for(int j = 1; j<=val ; j++) {
					System.out.print(rval+ "\t");
					rval++;
				}
				
				
				for(int j = 1; j<=sp ; j++) {
					System.out.print("\t");
				}
				
				
				for(int j = 1; j<=val ; j++) {
					rval--;
					System.out.print(rval+"\t");
					
				}
				
				
				val ++;
				sp -= 2;
				
			}
			
			else {
				int lrow = 1;
				for(int j =1 ; j<=2*num-1 ; j++) {
					
					System.out.print(lrow+"\t");
					
					if(j<=(2*num-1)/2) {
						lrow ++;
					}
					else {
						lrow--;
					}
				}
			}
			
			System.out.println();
				
			}
			
		}
		

	}


