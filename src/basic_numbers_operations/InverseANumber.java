package basic_numbers_operations;

public class InverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * Inverse a number
		 */

		int num = 21453;
		int count =0;
		int inv =0;
		
		while(num !=0) {
			int rem = num%10;
			
			num = num/10;
			
			count++;
			int temp = (int) Math.pow(10, rem-1)*count;
			inv = inv+temp;
			
			
			System.out.print(" "+rem);
			System.out.print(" "+count);
			System.out.println();
			
		}
		
		System.out.println(inv);
		
		
		
	}
}
