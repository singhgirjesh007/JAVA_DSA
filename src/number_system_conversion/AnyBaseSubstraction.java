package number_system_conversion;

public class AnyBaseSubstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(anyBaseSubstraction(1111, 111, 2));

	}
	

	public static int anyBaseSubstraction(int n1 , int n2 , int b) {
		
		int rv =0;
		int pow =1;
		int c =0;
		
		
		
		while ( n1 > 0) {
			
			int rem1 = n1%10;
			int rem2 = n2%10;
			
			n1 = n1/10;
			n2 = n2/10;
			
			int d =0;
			rem1 = rem1+c;
			
			if(rem1 >= rem2) {
				c =0;
				d =rem1 - rem2;
			}
			else {
				
				c =-1;
				d = rem1+ b - rem2;
			}
			
			rv = rv + d*pow;
			
			pow *= 10;
			
			
			
		}
		
		
		return rv ;
	}

}
