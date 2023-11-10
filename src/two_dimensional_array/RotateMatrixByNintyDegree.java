package two_dimensional_array;

public class RotateMatrixByNintyDegree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] b = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };

		for (int i = 0; i < b.length; i++) {

			for (int j = 0; j < b[0].length; j++) {

				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();	
		
		//Transpose of an matrix 
		
		for (int i = 0; i < b.length; i++) {

			for (int j = i; j < b[0].length; j++) {

				int temp = b[i][j];
				b[i][j] = b[j][i];
				b[j][i] = temp;
			}
		}

		for (int i = 0; i < b.length; i++) {

			for (int j = 0; j < b[0].length; j++) {

				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < b.length; i++) {

			int fi = 0;
			int li = b.length - 1;

			while (fi < li) {

				int temp = b[i][fi];
				b[i][fi] = b[i][li];
				b[i][li] = temp;

				fi++;
				li--;

			}

		}

		for (int i = 0; i < b.length; i++) {

			for (int j = 0; j < b[0].length; j++) {

				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}

	}

}
