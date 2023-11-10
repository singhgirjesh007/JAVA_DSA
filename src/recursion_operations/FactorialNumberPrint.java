package recursion_operations;

public class FactorialNumberPrint {
	
	public static int factorialRec(int n) {
		if ( n==1) {
			return 1;
		}
		int fnm = factorialRec(n-1);
		int fact = n * fnm;
		
		return fact ;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		
System.out.println(factorialRec(n));
	}

}
