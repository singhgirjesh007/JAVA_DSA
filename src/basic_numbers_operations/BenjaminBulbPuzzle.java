package basic_numbers_operations;

import java.util.Scanner;

public class BenjaminBulbPuzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//print square numbers
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		for(int i=1 ; i*i <=n;i++) {
			System.out.println(i*i);
		}

	}

}
