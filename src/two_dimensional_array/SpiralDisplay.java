package two_dimensional_array;

public class SpiralDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] b = { { 11, 12, 13, 14,15,16,17 }, { 21, 22, 23, 24,25,26,27 }, 
					{ 31, 32,33, 34, 35, 36 , 37 } , {41,42,43,44 , 45, 46, 47} , {51,52,53,54 , 55, 56, 57} };
		
		int minr = 0;
		int minc =  0;
		int maxr = b.length-1;
		int maxc = b[0].length-1;
		
		int tne = b.length * b[0].length ;
		int count = 0;
		
		while (count < tne) {
			
			//left wall
			for (int i = minr ,  j = minc ; i<=maxr && count < tne ; i++) {
				System.out.print(b[i][j]+ " ");
				count ++;
			}
			minc++;
			
			System.out.println();
			
			//bottom wall
			for (int i = maxr ,  j = minc ; j<=maxc && count < tne ; j++) {
				
				System.out.print(b[i][j]+ " ");
				count ++;
			}
			maxr--;
			
			System.out.println();
			//right wall
			for (int i = maxr ,  j = maxc ; i>=minr && count < tne ; i--) {
				System.out.print(b[i][j]+ " ");
				count ++;
			}
			maxc--;
			
			System.out.println();
			
			//top wall
			for (int i = minr ,  j = maxc ; j>=minc && count < tne ; j--) {
				System.out.print(b[i][j] + " ");
				count ++;
			}
			
			minr++;
			System.out.println();
			
			
			
			
			
		}
		
		
	}

}
