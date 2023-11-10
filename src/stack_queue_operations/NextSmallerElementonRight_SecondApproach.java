package stack_queue_operations;

import java.util.Stack;

public class NextSmallerElementonRight_SecondApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = { 3, 5, 6, 2, 4, 1, 2, 12, 2, 10, 8, 9 };

		int[] nge = new int[a.length];

		Stack<Integer> st = new Stack<>();

		int n = a.length - 1;
		
		st.push(0);
		
		for (int i = 1 ; i < a.length ; i++) {
			
			while (st.size() > 0 && a[i] <= a[st.peek()]) {
				int pos = st.peek();
				nge[pos] = a[i];
				st.pop();		
			}	
			st.push(i);	
		}
		
		
		while (st.size() > 0) {
			int pos = st.peek();
			nge[pos] =-1;
			st.pop();
		}
		
		for (int val : nge) {
			System.out.print(val + " ");
		}

	}

}
