package string_stringbuilder_operations;

import java.util.ArrayList;

public class BasicArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al = new ArrayList<>();
		
		System.out.println("List size " + al.size());
		
		al.add(10);
		al.add(20);
		
		System.out.print(al);
		System.out.println();
		al.get(1);
		
		al.add(1,30);
		System.out.print(al);
		System.out.println();
		
		al.set(1, 2000);
		System.out.print(al);
		System.out.println();
		
	   //	al.remove(3);
		 
		for (int i = 0 ; i < al.size() ; i++) {
			
			System.out.println(al.get(i));
		}
		
		System.out.println("for each value print");
		
		for ( int val : al ) {
			
			System.out.println(val);
		}
	}

}
