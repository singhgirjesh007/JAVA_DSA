package stack_queue_operations;

import java.util.Stack;

public class LargestAreaOfHistogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 6,2,5,4,5,1,6 };
		int n = a.length - 1;

		Stack<Integer> st = new Stack<Integer>();
		System.out.println(st);
		int[] rb = new int[n + 1];
		int[] rbv = new int[n + 1];

		st.push(0);
		//rb[a.length-1] = a.length;

		for (int i = 1; i <= n; i++) {
			while (st.size() > 0 && a[i] < a[st.peek()]) {
				int pos = st.peek();
				rbv[pos] = a[i];
				rb[pos] = i;
				st.pop();
			}

			st.push(i);
		}
		while (st.size() > 0) {
			int pos = st.peek();
			rbv[pos] = -1;
			rb[pos] = a.length;
			st.pop();

		}
		for (int val : rb) {
			System.out.print(val + " ");
		}

		System.out.println();
		
		int[] lb = new int[n + 1];

		st.push(0);
		lb[0] = -1;

		
		for (int i = 1; i <= n; i++) {

			while (st.size() > 0 && a[i] < a[st.peek()]) {
				st.pop();
			}

			if (st.size() > 0) {
				
				lb[i] = st.peek();
			} else {
				
				lb[i] = -1;
				
			}

			st.push(i);

		}

		for (int val : lb) {
			System.out.print(val + " ");
		}
		
		System.out.println();
		int maxArea = 0;
		for (int i =0 ; i<a.length ; i++) {
			
			int width = (rb[i] - lb[i])-1;
			int height = a[i];
			int area = width*height;
			
			if (area > maxArea) {
				maxArea = area;
			}
			
			
		}
		
		System.out.println(maxArea);
	}

}
