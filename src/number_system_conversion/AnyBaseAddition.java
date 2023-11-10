package number_system_conversion;

public class AnyBaseAddition {

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

		System.out.println(anyBaseAddition(236, 754, 8));
		System.out.println(anyBaseAddition(1100, 111, 2));
	}

}
