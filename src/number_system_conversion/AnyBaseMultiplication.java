package number_system_conversion;

public class AnyBaseMultiplication {

	public static int anyBaseMultiplication(int n1, int n2, int b) {
		
		int rv =0;
		int pow =1;
		
		while(n2 >0 ) {
			
			int d2 = n2%10;
			n2=  n2/10;
			
			int sprd = anyBaseSingleDigitMult(n1, d2, b);
			rv = anyBaseAddition(rv, sprd*pow, b);
			pow *= 10;
			
		}
		
		return rv;
	
	}
	
	public static int anyBaseSingleDigitMult(int n1 , int d2 , int b) {
		
		int rv =0;
		int c =0;
		int pow = 1;
		
		while( n1>0 || c > 0) {
		
			int d1 =n1%10;
			n1 = n1/10;
			
			int d =d1*d2 + c;
			
			c =d/b;
			rv = d%b *pow + rv;	
			
		}
		
		return rv;
		
	}
	
	public static int anyBaseAddition(int n1, int n2, int b) {

		int rv = 0;
		int c = 0;
		int pow = 1;

		while (n1 > 0 || n2 > 0 || c > 0) {

			int rem1 = n1 % 10;
			int rem2 = n2 % 10;

			int r3 = rem1 + rem2 + c;

			rv = (r3 % b )*pow+ (rv );

			pow *= 10;
			
			
			n1 = n1 / 10;
			n2 = n2 / 10;
			c = r3 / b ;

		}

		return rv;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(anyBaseMultiplication(10	,11,2));
	}

}
