package two_dimensional_array;

import java.util.Scanner;

public class TwoDArrDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int m = scn.nextInt();
		
		int[][] arr = null ;
		System.out.println(arr);
		
		arr = new int[n][m];
		System.out.println(arr);
		
		for (int i = 0; i <= n-1 ; i++) {
			for (int j =0 ; j <= m-1; j++) {
				
				arr[i][j] = i*j;
				
			}
			
		}
		
		//Refer memory diagram to understand row and column concept
		
		int row = arr.length;
		int col = arr[0].length;
		
		for (int i = 0; i <= row-1; i++) {
			for (int j =0 ; j <= arr[i].length-1; j++) {
				
				System.out.print(arr[i][j] + " ");
				
			}
			 System.out.println();
		}

	}

}
