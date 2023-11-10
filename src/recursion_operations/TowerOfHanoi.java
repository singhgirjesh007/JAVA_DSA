package recursion_operations;

public class TowerOfHanoi {
	
	public static void towerOfHanoi(int n , int t1 , int t2 , int t3) {
		
		if (n == 0) {
			return;
		}
		
		towerOfHanoi(n-1, t1, t3 , t2);
		System.out.println("Number " + n + " disk move from tower " + t1 + " -> tower " + t2 );
		towerOfHanoi(n-1, t3, t2, t1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		towerOfHanoi(5, 1, 2, 3);
	}

}
