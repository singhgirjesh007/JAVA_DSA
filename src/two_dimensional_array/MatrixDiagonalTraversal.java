package two_dimensional_array;

public class MatrixDiagonalTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] b = { { 11, 12, 13, 14, 15, 16 }, { 21, 22, 23, 24, 25, 26 }, { 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46}, { 51, 52, 53, 54, 55, 56 } , {61,62,63,64,65,66}};
		
		
		
		//during diagonal traversal i-j  check
		//creare one gap loop
		
		for(int gap =  0 ; gap < b.length ; gap++) {
			
			for (int i = 0 , j = gap ; j <b.length ; i++ , j++) {
				
				System.out.print(b[i][j]+ " ");
			}
			System.out.println();
		}
			
		

	}

}
