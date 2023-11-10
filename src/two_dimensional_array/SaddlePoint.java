package two_dimensional_array;

public class SaddlePoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Number in row  minium nut max for that column 
		
		int[][] b = { { 11, 12, 13, 14, 15, 16 }, { 21, 22, 23, 24, 25, 26 }, { 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46}, { 51, 52, 53, 54, 55, 56 } , {61,62,63,64,65,66}};
		
		
		
		for (int i = 1 ;  i< b.length ; i++) {
			int svj = 0;
			int min  = b[i-1][svj];
			
			for ( int j = 1 ; j < b[0].length ; j++) {
				if (b[i][j]< min) {
					min = b[i][j];
					svj =j ;
					
				}	
			}
			
			boolean flag = true;
			for ( int k = 0 ; k < b.length ; k++) {
				
				if (b[k][svj] > b[i][svj]) {
					flag = false;
					break ;
				}
			}
			
			if (flag == true) {
				System.out.println(b[i][svj]);
				return;
			}
			
			
			
		}
		
		System.out.println("invalid input");

	}

}
