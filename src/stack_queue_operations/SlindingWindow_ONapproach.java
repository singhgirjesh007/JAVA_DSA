package stack_queue_operations;

import java.util.Stack;

public class SlindingWindow_ONapproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 2, 4, 5, 19, 8, 6, 13, 12, 14, 16, 2, 4, 5, 18, 16, 17, 21 };
		int[] nge = new int[a.length];

		Stack<Integer> st = new Stack<>();

		st.push(0);

		for (int i = 1; i <= a.length - 1; i++) {

			while (st.size() > 0 && a[i] >= a[st.peek()]) {
				int pos = st.peek();
				nge[pos] = i;
				st.pop();
			}

			st.push(i);
		}

		while (st.size() > 0) {
			int pos = st.peek();
			nge[pos] = a.length;
			st.pop();

		}
		
		/*
		 * for (int val : nge) { System.out.print(val + " "); }
		 */
		for (int i = 0 ; i <= a.length - 4 ; i++) {
			
			int j =i ;
			while (nge[j] < i+4) {
				j = nge[j];
			}
			
			System.out.print(a[j] + " ");
		}
		
			

	}

}
