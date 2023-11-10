package collection_framework_operations;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapNullHandling {
	
	public static void main(String[] a) {
		
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "Selenium");
		hm.put(2, "testcomplete");
		hm.put(3, "playright");
		hm.put(4, "playright");
		hm.put(null, null);
		
		for (Entry<Integer,String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		System.out.println();
		hm.put(null, "test");
		
		for (Entry<Integer,String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		hm.put(1, "Selenium");
		hm.put(3, "Selenium");
		System.out.println();
		
		for (Entry<Integer,String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		//immutable map with only one value
		
		Map<String,Integer> map = Collections.singletonMap("test", 200);
		//it will not accept second value
		
	}

}
