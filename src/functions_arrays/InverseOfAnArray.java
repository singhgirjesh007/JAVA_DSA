package functions_arrays;

public class InverseOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {3,0,2,1,4,5};
		
		int[] inv = new int[a.length];
		
		
		for(int i= 0 ; i<a.length ; i++) {
			
				int v = a[i];
				inv[v] = i;
			
			
			
		}
		
		for(int v : inv) {
			System.out.println(v);
		}
			
	}

}
