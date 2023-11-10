package string_stringbuilder_operations;

import java.util.ArrayDeque;
import java.util.Stack;

public class BasicStachAndQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> st = new Stack<>();

		st.add(10);
		st.add(30);
		st.add(400);
		st.add(500);

		System.out.println(st);

		System.out.println();

		System.out.println(st.peek());
		System.out.println();

		st.pop();

		System.out.println(st);
		
		System.out.println("Queue");
		
		ArrayDeque<Integer> q = new ArrayDeque<>();
		
		q.addFirst(10);
		q.addFirst(30);
		q.addFirst(60000);
		q.addLast(191);
		System.out.println(q);
		System.out.println();
		q.add(4000);
		System.out.println(q);
		System.out.println();
		
		q.removeLast();
		System.out.println(q);
	}

}
