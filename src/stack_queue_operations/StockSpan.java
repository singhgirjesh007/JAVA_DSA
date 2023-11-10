package stack_queue_operations;

import java.util.Stack;

public class StockSpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 7, 6, 5, 3, 4, 11, 2, 7, 14, 5 };

		int n = a.length - 1;
		int[] nge = new int[n + 1];
		int[] span = new int[n + 1];

		Stack<Integer> st = new Stack<>();

		st.push(0);
		nge[0] = -1;
		span[0] =1;

		for (int i = 1; i <= n; i++) {

			while (st.size() > 0 && a[i] > a[st.peek()]) {
				st.pop();
			}

			if (st.size() > 0) {
				int pos = st.peek();
				nge[i] = a[pos];
				span[i] =  (i - pos )+1;

			} else {
				nge[i] = -1;
				span[i] = i+1;
			}

			st.push(i);

		}

		for (int val : span) {

			System.out.print(val + " ");
		}

	}

}
