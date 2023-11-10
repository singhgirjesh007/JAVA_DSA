package basic_numbers_operations;

public class Basic01_Math {
	
	public static void main(String[] args) {
		
		int x = 15;
		int y = 10;
		
		int sum = x + y;
		System.out.println("sum of " + x + " and " + y + " is " + sum);
		
		int mod = x%y;
		System.out.println("modulus of x and y is " +mod);
		
		int exp = (x*y)/(x+y);
		
		System.out.println(exp);
		
	}

}
