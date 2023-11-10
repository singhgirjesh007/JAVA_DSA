package recursion_operations;

public class PowerFunction {
	
	public static int powerFunc (int x , int n) {
		
		if (n==0) {
			return 1;
		}
		
		int pnm1 = powerFunc(x,n-1);
		int pnm = x * pnm1;
		return pnm ;		
	}
	
public static int powerFunc1 (int x , int n) {
		
		if (n==0) {
			return 1;
		}
		
		int pnm1 = powerFunc(x,n/2);
		int pnm = pnm1 * pnm1;
		
		if (n%2 == 1) {
			pnm = pnm*x;
		}
		
		return pnm ;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(powerFunc1(2, 5));

	}

}
