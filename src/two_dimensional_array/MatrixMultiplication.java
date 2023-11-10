package two_dimensional_array;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = { { 1, 2, 3 }, { 2, 3, 4 } };
		int[][] b = { { 2, 3, 4, 5 }, { 4, 5, 6, 7 }, { 8, 7, 0, 1 } };

		int r1 = a.length;
		int c1 = a[0].length;
		int r2 = b.length;
		int c2 = b[0].length;

		int[][] prd = new int[r1][c2];

		if (c1 != r2) {

			System.out.println("not compatible for multiplication");
		} else {

			for (int i = 0; i < r1; i++) {

				for (int j = 0; j < c2; j++) {
					prd[i][j] = 0;
					for (int k = 0; k <c1; k++) {

						prd[i][j] += a[i][k] * b[k][j];

					}
				}
			}

		}
		
		for (int i = 0; i < r1; i++) {

			for (int j = 0; j < c2; j++) {
				System.out.print(prd[i][j] +" ");
			}
			System.out.println();
		}
	}

}
