package two_dimensional_array;

public class ShellRotate {

	public static int[] fillOnedFromShell(int[][] arr, int s) {
		
		int minc = s-1;
		int minr = s-1;
		int maxr = arr.length-s;
		int maxc = arr[0].length-s;
		
		//int sz = (2*(maxr - minr +1)) + (2*(maxc-minc+1))-4;
		int sz = 2*(maxr-minr + maxc-minc);
		//Number of element is shell
		
		int[] oned = new int[sz];
		int count = 0;
		
		
		
		for (int i = minr , j = minc ; i<= maxr ; i++ ) {
			oned[count] = arr[i][j];
			//System.out.println(oned[count]);
			count++;
		}
		
		for (int i = maxr ,j = minc+1   ; j<= maxc ; j++ ) {
			oned[count] = arr[i][j];
		//	System.out.println(oned[count]);
			count++;
		}
		
		for (int i = maxr-1 , j = maxc ; i>= minr ; i-- ) {
			oned[count] = arr[i][j];
		//	System.out.println(oned[count]);
			count++;
		}
		
		for (int i = minr ,j = maxc-1  ; j>= minc+1 ; j-- ) {
			oned[count] = arr[i][j];
		//	System.out.println(oned[count]);
			count++;
			
		}
		
	//	for(int i = 0 ; i<oned.length;i++) {
	//	System.out.print(oned[i] + " ");
	//	}
		
		
		return oned;

	}
	
	public static void rotate(int[] oned , int r) {
		
		r = r%oned.length;
		if (r < 0) {
			
			r = r + oned.length;
		}
		reverse (oned , 0 , oned.length-1-r);
		reverse (oned , oned.length-r ,oned.length-1 );
		reverse (oned , 0 , oned.length-1);
	
		
	}

	public static void reverse(int[] oned , int l , int f) {
		int li =l ;
		int fi = f;
		
		while (li < fi) {
			int temp = oned[li];
			oned[li] = oned [fi];
			oned[fi] = temp;
			
			li++;
			fi--;
		}
		
	}

	public static void filledShellfromOned(int[][] arr , int[] oned, int s) {

		int minc = s-1;
		int minr = s-1;
		int maxr = arr.length-s;
		int maxc = arr[0].length-s;
		
		
		//Number of element is shell	
		int count = 0;
		
	
		for (int i = minr , j = minc ; i<= maxr ; i++ ) {
			  arr[i][j] = oned[count];
			count++;
		}
		
		for (int j = minc+1 , i = maxr ; j<= maxc ; j++ ) {
			arr[i][j] = oned[count];
			count++;
		}
		
		for (int i = maxr-1 , j = maxc ; i>= minr ; i-- ) {
			oned[count] = arr[i][j];
			count++;
		}
		
		for (int j = maxc-1 , i = minr ; j>= minc+1 ; j-- ) {
			arr[i][j] = oned[count];
			count++;
			
		}

		

	}

	public static void shellRotate(int[][] arr, int s, int r) {

		int[] oned = fillOnedFromShell(arr, s);

		rotate(oned, r);

		filledShellfromOned(arr ,oned, s);
		
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] b = { { 11, 12, 13, 14, 15, 16 }, { 21, 22, 23, 24, 25, 26 }, { 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46}, { 51, 52, 53, 54, 55, 56 } , {61,62,63,64,65,66}};

		int s = 1;
		int r = 2;
		
		shellRotate(b , s, r);
		
		System.out.println();
		for (int i =0 ; i< b.length ; i++) {
			for(int j =0  ; j < b[0].length ; j++) {
				
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
	}

}
