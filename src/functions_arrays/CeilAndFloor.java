package functions_arrays;

public class CeilAndFloor {
	
	
	public static void main(String[] args) {

		int[] a = {10 , 20 , 30 ,40 ,50 ,60 ,70 ,90 };

		int d = 95;
		
		int l =0;
		int h = a.length-1;
		int ceil =0;
		int floor  =0 ;
		
		while(l <=h) {
			
			int mid = (l+h)/2;
			
			if (d < a[mid]) {
				h = mid -1;
				ceil = a[mid];	
			}
			
			else if (d > a[mid]) {
				l = mid +1;
				floor = a[mid];
				
			}
			
			else {
				
				ceil = a[mid];
				floor = a[mid];
				break;
			}
				
		}
		System.out.println(floor + " " + ceil);
		
		/*
		 * if else loop solution123rd
		 * 
		for(int i =0 ; i<a.length ;i++){
		
		if (a[i] > d) {
			System.out.print(0 + " " + a[i] );
			break;
		}
		else if (a[i]== d) {
			System.out.print(a[i] + " " + a[i]);
			break;
		}
		else if(a[i]<d && a[i+1] >d) {
			System.out.print(a[i] + " "  + a[i+1] );
			break;
		}
		
		else if (d > a[a.length-1]) {
			System.out.print(a[a.length-1]);
			break;
		}
		
		
		}

		*/


	}

}
