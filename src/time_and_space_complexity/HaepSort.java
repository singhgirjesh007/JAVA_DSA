package time_and_space_complexity;

import java.util.PriorityQueue;

public class HaepSort {
	
	public static int[] heapSort(int[] arr) {
		int[] a = new int[arr.length];
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int val : arr) {
			pq.add(val);
		}
		
		int i=0;
		while (pq.size() > 0) {
			
			a[i] = pq.peek();
			pq.remove();
			
			i++;
		}
		
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {23,56,2,1,78,88 ,-2};
		heapSort(arr);
		
		for(int val : heapSort(arr)) {
			System.out.print(val + " ");
		}
	}

}
