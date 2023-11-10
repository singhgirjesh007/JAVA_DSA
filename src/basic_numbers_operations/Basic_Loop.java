package basic_numbers_operations;

import java.util.Scanner;

public class Basic_Loop {
	
	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		String str = scn.nextLine();
		// while loop ( initialization , condition check , body , increment , condiition check , body , increment ... untill true) 
		
		/*
		 * int i=1;
		 * 
		 * while(i<=9) {
		 * 
		 * System.out.println(i); i++; }
		 * 
		 */
		
		for(int i=1;i<=9 ; i++) {
			System.out.println(i);
		}
		
		System.out.println("done");
		
		
		System.out.println(str);
		
		
	}

}
