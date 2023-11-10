package recursion_operations;

public class ZigZagOperation {
	
	// good program to understand recursion by stack memory diagram
	
	public static void pzz(int n) {
		
		if (n == 0) {
			return ;
		}
		
		System.out.println("Pre" + n);
		pzz(n-1);
		System.out.println("In" + n);
		pzz(n-1);
		System.out.println("Post" + n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
