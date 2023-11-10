package number_system_conversion;

import java.util.Scanner;

public class DecimslToAnyBase {
	
	public static int decimalToAnyBase(int num , int base) {
		
		int count =0;
		int oct =0;
		int power =1;
		
		while(num !=0) {
			
			int rem = num%base ;
			//oct  = (int) Math.pow(10, count)*rem +oct;
			//insted of power function
			
			oct += rem*power;
			// oct = rem*power + oct
			power *= 10;
			// power  = power*10
			
			
			num = num/base;
			count++;
			
		}
		
		return oct;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int base = scn.nextInt();
		
		
	
		System.out.println(decimalToAnyBase(num, base));
	
	}

}
