package recursion_operations;

public class LastIndexOfAnOccurance {
	
	public static int lastOccu(int[] arr , int idx ,int k) {
		
		if (idx == arr.length) {
			return -1;
		}
		
		
		int liisa =lastOccu(arr , idx+1 ,k);
		
		if (liisa == -1) {
			if (arr[idx] == k) {
				return idx;
			}else {
				return -1;
			}	
		}
		else {
			return liisa;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1,2,3,4,5,3,2,1};
		lastOccu(arr, 0, 3);
		System.out.println(lastOccu(arr, 0, 3));
	}

}
