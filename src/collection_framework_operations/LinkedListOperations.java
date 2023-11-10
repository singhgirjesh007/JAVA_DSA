package collection_framework_operations;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ls = new LinkedList<>();
		
		ls.add(10);
		ls.add(30);
		
		System.out.println(ls);
		System.out.println();
		
		ls.addFirst(40);
		
		ls.set(0, 20);
		
		System.out.println(ls.size());
		
		Iterator<Integer> itr = ls.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next()+ " ");
		}
		
		System.out.println();
		
		LinkedList<Integer> ls1 = new LinkedList<>();
		
		ls1.add(40);
		ls1.add(50);
		
		ls.addAll(ls1);
		
		for(int val : ls) {
			System.out.print(val + " ");
		}
		
		ls.remove(0);
		
		System.out.println();
		for(int val : ls) {
			System.out.print(val + " ");
		}
	}

}
