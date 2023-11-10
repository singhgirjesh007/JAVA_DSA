package string_stringbuilder_operations;

import java.util.Scanner;

public class ToggleCase { 
	
	
	public static String toggleConversion(String s) {
		
		StringBuilder sb = new StringBuilder(s);
		
		for(int i = 0 ; i <sb.length(); i++) {
			char ch = sb.charAt(i);
			
			if (ch >= 'a' && ch <= 'z' ) {
				char uc = (char) ('A' + ch - 'a') ;	
				sb.setCharAt(i, uc);
				//System.out.println(sb.charAt(i));
			}
			
			else if (ch >= 'A' && ch <= 'Z') {
			    char lc = (char) ('a' + ch - 'A') ;
			    sb.setCharAt(i, lc);
			   // System.out.println(sb.charAt(i));
			}
			
		
			
		}
		
		return sb.toString();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		//String s  = scn.nextLine();
		
		String s1 = "aaaaBBBcccDDDeee";
		System.out.println(toggleConversion(s1));
		
		
		
	/*	char ch = 'a';
		char ch2 = 'g';
		
		int gap = ch2 - ch;
		int d = 'z';
		
		char c3 = (char) (12);
		System.out.println(gap);
		System.out.println(d);
		
		
		System.out.println(c3);
		System.out.println();
	*/
		

	}

}
