package stack_queue_operations;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueOperations {
	
	public static void main(String[] args) {
		
		
		Queue<Integer> q = new ArrayDeque<>();
		
		//First in first out
		
		q.add(10);
		q.add(20);
		q.add(30);
		System.out.println(q);
		System.out.println(q.peek());
		
		System.out.println(q.remove());
		System.out.println(q);
	}

}
