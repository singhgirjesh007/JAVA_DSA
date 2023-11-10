package functions_arrays;

public class FactorialFunction {
	
	public static int factorial_func(int n) {
		
		int fact =1;
		for(int i =1; i<=n; i++) {
			fact = fact*i;
		}
		return fact;
			
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(factorial_func(5));
		System.out.println(factorial_func(6));
		
	}

}
