package collection_framework_operations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<>();
		ArrayList<Integer> ar = new ArrayList<>();
		
		hm.put(1, "Selenium");
		hm.put(2, "testcomplete");
		hm.put(3, "playright");
		hm.put(4, "playright");
		
		
		
		Set<Entry<Integer, String>> em = hm.entrySet();
		System.out.println(em);
		for (Entry<Integer,String> em1 : hm.entrySet()) {
			System.out.println(em1.getKey() + " " + em1.getValue());
		}
		
		
		
		System.out.println();
		System.out.println(ar);
		System.out.println();
		
		Set<Integer> s = hm.keySet(); // Return set of Key 
		Iterator<Integer> itr = s.iterator();
		while(itr.hasNext()) {
			ar.add(itr.next());
		}
		System.out.println();
		
		
		ArrayList<Integer> ar1 = new ArrayList<>(hm.keySet());
		System.out.println();
		System.out.println(ar1);
		
		Collection<String> d = hm.values(); //Return Collection of String values
		
		ArrayList<String> ar2 = new ArrayList<>(d);
		System.out.println();
		System.out.println(ar2);
		
		
		
		
	}

}
