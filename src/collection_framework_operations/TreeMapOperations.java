package collection_framework_operations;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> tmap = new TreeMap<>();
		
		tmap.put(1000, "A");
		tmap.put(1500, "B");
		tmap.put(5000, "C");
		tmap.put(3000, "D");
		tmap.put(1000, "F");
		
		tmap.firstKey();
		tmap.lastKey();
		tmap.firstEntry();
		tmap.lastEntry();
		
		System.out.println(tmap);
		
		Set<Integer> setlessThan300 = tmap.headMap(3000).keySet();
		System.out.println(setlessThan300 );
		
		System.out.println();
		tmap.forEach((k,v)->{
			System.out.println(k + " "+ v);
		});
	}

}
