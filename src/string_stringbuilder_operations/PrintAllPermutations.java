package string_stringbuilder_operations;

public class PrintAllPermutations {

	public static int factorialNum(int num) {

		int fact = 1;

		for (int i = 1; i <= num; i++) {

			fact = fact * i;
		}

		return fact;

	}

	public static String solution(String s) {
		
		int  n=  s.length();
		int f = factorialNum(n);
		
		
		
		for(int i = 0; i< f ; i++) {
			StringBuilder sb = new StringBuilder(s);
			
			
			int temp = i;
			
			for(int div = n ; div >=1 ;div--) {
			int r  = temp%n;
			int q = temp/n;
			
			System.out.print(sb.charAt(r));
			sb.deleteCharAt(r);
			
			temp =q;
			
			}
			
			System.out.println();
			
		}

		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abcd";
		solution(s);

	}

}
