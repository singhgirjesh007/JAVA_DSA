package basic_numbers_operations;

import java.util.Scanner;

public class Basic_GradingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // input - don't change this code
	    Scanner scn = new Scanner(System.in);
	    int marks = scn.nextInt();
	    // input - don't change this code
	    // code here
	    if (marks > 90)
	      System.out.println("excellent.");
	    else if (marks > 80 && marks <= 90)
	      System.out.println("good.");

	    else if (marks > 70 && marks <= 80)
	      System.out.println("fair.");

	    else if (marks > 60 && marks <= 70)
	      System.out.println("meets expectations.");

	    else
	      System.out.println("below par.");

	}

}
