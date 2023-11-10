package practice_programs;

public class FibonaciProgram {
	
	
	
	public static void fibonacciFunction(int n) {
		
		int previous =0;
		int next = 1;
		
		
		while (n>= 0) {
			
			System.out.println(previous);
			int sum = previous+next;
			previous = next;
			next = sum;
			n--;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibonacciFunction(8);
	}

}
