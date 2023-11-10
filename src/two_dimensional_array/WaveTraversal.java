package two_dimensional_array;

public class WaveTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] b = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32,33, 34 } };
		
		
		
		
		for (int j = 0; j <b[0].length; j++) {
			
			if (j%2 == 0) {
				
				for (int i = 0 ; i <b.length ; i++) {
					System.out.println(b[i][j]);
				}
				
			}else {
				
				for (int i = b.length-1 ; i>=0 ; i--) {
					System.out.println(b[i][j]);
				}
				
			}
			
			
			
		}
	}

}
