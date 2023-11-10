package stack_queue_operations;

import java.util.Stack;

public class NextGreaterOnRight_FirstApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {5 , 4 , 12, 15, 7 , 8 ,9 , 14 , 7 };
		int n = a.length;
		int[] nge = new int[n];
		Stack<Integer> st = new Stack<>();
		
		st.push(a[n-1]);
		nge[n-1] = -1;
		
		for ( int i = n-2 ; i>=0 ; i--) {
			
			
			while (st.size() > 0 && a[i] > st.peek() ) {
				st.pop();
				
			}
			
			if (st.size()== 0) {
				
				nge[i] = -1;
			}else {
				nge[i] = st.peek();
			}
			
			st.push(a[i]);
			
			
		}
		
		for(int val : nge) {
			System.out.println(val);
		}
	}

}
