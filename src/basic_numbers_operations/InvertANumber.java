package basic_numbers_operations;

public class InvertANumber {
	
	public static void main (String[] args) {
		
		int num = 2364664;
		int temp =num;
		int count =0 ;
		int rot =0;
		
		
		while(temp !=0) {
			int quo = temp/10;
			temp = quo;
			count ++;
			
		}
		System.out.println(count);
		
		while(num !=0) {
			int rem = num%10;
			num=num/10;
			
			rot = rot+ ((int)Math.pow(10, count-1)*rem);
			count--;
			
		}
		
		
		System.out.println(rot);
		
	}

}
