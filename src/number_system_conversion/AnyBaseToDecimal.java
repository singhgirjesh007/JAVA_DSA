package number_system_conversion;

public class AnyBaseToDecimal {
	
	
	public static int anyBaseToDecimal(int n , int b ){
		
		int decimal = 0;
		int power  =1;
		
		while(n >0) {
			
			int rem = n%10;
			n = n/10;
			
			decimal =  decimal + rem*power;
			power = power*b;
			
		}
		
		return decimal;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(anyBaseToDecimal(1172, 8));

	}

}
