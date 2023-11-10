package two_dimensional_array;

public class ExitPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] b = { { 0, 0, 1, 0 }, { 1, 0, 0, 1 }, { 0, 0, 0, 1 }, { 1, 0, 1, 0 } };

		int dir = 0;
		int i = 0;
		int j = 0;

		while (true) {

			dir = (dir + b[i][j]) % 4;

			if (dir == 0) {

				j++;
			} else if (dir == 1) {

				i++;
			} else if (dir == 2) {

				j--;
			} else if (dir == 3) {

				i--;
			}

			if (i<0) {

				i++;
				break;
			} else if (j<0) {

				j++;
				break;
			} else if (i == b.length) {

				i--;
				break;
			} else if (j == b[0].length) {

				j--;
			}
		}

		System.out.println("exit point " + i + " " + j);

	}

}
