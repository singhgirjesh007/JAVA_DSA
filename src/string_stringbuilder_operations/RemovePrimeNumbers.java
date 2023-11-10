package string_stringbuilder_operations;

import java.util.ArrayList;
import java.util.Scanner;

public class RemovePrimeNumbers {

	public static boolean isPrime(int val) {

		

		for (int i = 2; i * i < val; i++) {

			if (val % i == 0) {
				return false;
			}
		}
		return true;

	}
	
	public static void solution(ArrayList<Integer> a) {
		
		for(int  i = a.size()-1 ; i >= 0 ; i--) {
			
			if(isPrime(a.get(i))) {
				a.remove(i);
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList<>();
		System.out.println(al.size());

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		for (int i = 0; i < n; i++) {

			al.add(scn.nextInt());

		}
		
		solution(al);
		System.out.println(al);

	}

}
