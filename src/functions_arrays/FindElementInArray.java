package functions_arrays;

import java.util.Scanner;

public class FindElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int[] a  = new int[n];
		
		for(int i= 0 ; i< a.length ; i++) {
			a[i] = scn.nextInt();	
		}
		
		int d = scn.nextInt();
	//	int flag =0;
	//	int j = 0;
		int idx =-1;
		for(int i= 0 ; i< a.length ; i++) {
			
			if(d == a[i]) {
			//	flag++;
			//	j= i;
				idx = i;
				break;
			}
			
		}
		
		System.out.println(idx);
		
	/*	if(flag> 0) {
			System.out.println(j);
		}
		else
			System.out.println("-1");
		
	*/	

	}

}
