package stack_queue_operations;

import java.util.Stack;

public class NextSmallerElementOnRight_FirstApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// right to left approach

		int[] a = { 3, 5, 6, 2, 4, 1, 2, 12, 2, 10, 8, 9 };

		int[] nge = new int[a.length];

		Stack<Integer> st = new Stack<>();

		int n = a.length - 1;

		st.push(a[n - 1]);
		nge[n] = -1;

		for (int i = n - 1; i >= 0; i--) {

			while (st.size() > 0 && a[i] <= st.peek()) {

				st.pop();
			}

			if (st.size() == 0) {
				nge[i] = -1;
			}

			else {
				nge[i] = st.peek();

			}

			st.push(a[i]);

		}
		
		for ( int val : nge) {
			System.out.print(val + " ");
		}
	}
	

}
