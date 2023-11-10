package stack_queue_operations;

public class SlindingWindow_ON2approach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {2,4,5,19,8,6,13,12,14,16,2,4,5,18,16,17,21};
		
		for (int i =0 ; i< a.length-3 ; i++) {
			int max = 0;
			for (int j =i ; j <= i+3 ; j++) {
				
				if (a[j]>max) {
					max = a[j];
				}
				
			}
			System.out.print(max + " ");
		}
	}

}
