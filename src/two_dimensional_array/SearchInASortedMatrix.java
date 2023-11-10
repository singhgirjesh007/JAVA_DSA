package two_dimensional_array;

public class SearchInASortedMatrix {
	
	
	public static void main(String[] args) {
		
		
		int[][] b = { { 11, 12, 13, 14, 15, 16 }, { 21, 22, 23, 24, 25, 26 }, { 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46}, { 51, 52, 53, 54, 55, 56 } , {61,62,63,64,65,66}};
		
		int x = 39;
		
		
		int i = 0 ;
		int j = b.length -1 ;
		
		boolean flag = false;
		
		while (i <b.length && j >= 0) {
			
			if (x == b[i][j]) {
				System.out.println(i);
				System.out.println(j);
				flag = true;
				break;
			}
			else if  (x < b[i][j]) {
				j--;
			}else {
				i++ ;
			}
			
		}
		
		if (flag == false)
		System.out.println("Not found");
		
	}

}
