package collection_framework_operations;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOperations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ar = new ArrayList<>();
		ar.add("tom");
		ar.add("bing");
		ar.add("a");
		ar.add("b");
		ar.add(null);
		
		ArrayList<String> ar1 = new ArrayList<>();
		ar1.add("test");
		ar1.add("dev");
		ar1.add("a");
		ar1.add("b");
		
		ar1.retainAll(ar);
		
		System.out.println("through Lamda expression and Forc Lopp");
		ar.forEach(val->{
			System.out.print(val+" ");
		});
		System.out.println();
		System.out.println(ar.contains(null));
		
		Iterator<String> itr =ar1.iterator();
		itr.forEachRemaining(val->{
			System.out.print(val + " ");
		});
		
		ar.addAll(ar1);
		
		
		System.out.println();
		System.out.println(ar.contains(null));
		
		Iterator<String> itr1 =ar.iterator();
		itr1.forEachRemaining(val->{
			System.out.print(val + " ");
		});
		
		
		

	}

}
