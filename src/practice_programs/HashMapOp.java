package practice_programs;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		hm.put(1,10);
		hm.put(2, 11);
		hm.put(3, 14);
		
		hm.forEach((k,v)->
		{
			System.out.println(k + " " + v);
		}
				
				);
		
		for(Entry<Integer, Integer> e : hm.entrySet()) {
			
			System.out.println(e.getKey() + " " + e.getValue());
		}
		
		Set<Integer> s = hm.keySet();
		Collection<Integer> v = hm.values();
		
		for(int val : v) {
			System.out.println(val);
		}
		
	
	}

}
