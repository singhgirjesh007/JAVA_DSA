package number_system_conversion;

public class AnyBaseToAnyBase {
	
	
public static int anyBaseToAnyBase(int n , int b1 , int b2 ){
		
		int decimal = 0;
		int power  =1;
		
		while(n >0) {
			
			int rem = n%b2;
			n = n/b2;
			
			decimal =  decimal + rem*power;
			power = power*b1;
			
		}
		
		return decimal;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(anyBaseToAnyBase(1172, 8 , 10));

	}
}
