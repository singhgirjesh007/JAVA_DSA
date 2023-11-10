package collection_framework_operations;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;

/**
 * 
 * @author singh
 * It is similar to HashMap but it is synchronized
 * key --> Object --> HashCode --> value
 * 
 * 
 */

public class HashTableOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer, String> hs = new Hashtable<Integer, String>();
		hs.put(1, "Selenium");
		hs.put(2, "Test");
		hs.put(3, "Playright");
	//	hs.put(null, null); NullPointerException but in map there will not be exception it will adjust accordingly
	//	hs.put(1, null); NullPointerException
		hs.put(5, "twinklw");
		hs.put(4, "Playright");
		hs.put(4, "amazing"); // Only one key value will appear in Hashtable for 4 as it's containes unique content
		
		System.out.println(hs);
		System.out.println();
		
		hs.remove(5);
		
		System.out.println();
		System.out.println(hs.get(2));
		System.out.println();
		
		System.out.println(hs.containsKey(5));
		System.out.println(hs.containsValue("Selenium"));
		
		for(Entry<Integer,String> e : hs.entrySet()) {
			System.out.println(e.getKey()+" "+ e.getValue());
		}
		System.out.println();
		System.out.println("Using enumeration for iteration");
		Enumeration<String> hitr = hs.elements();
		while(hitr.hasMoreElements()) {
			System.out.println(hitr.nextElement());
		}
		
		Hashtable<Integer, Integer> hs1 = new Hashtable<Integer, Integer>();
		hs1.put(1, 10);
		hs1.put(2, 20);
		hs1.put(3, 30);
		
		System.out.println();
		System.out.println("Using enumeration for iteration");
		Enumeration<Integer> hitr1 = hs1.elements();
		while(hitr1.hasMoreElements()) {
			System.out.println(hitr1.nextElement());
		}
		
		System.out.println();
		//get the hashcode
		System.out.println(hs.hashCode());
		System.out.println(hs1.hashCode());
		
		boolean b = hs.equals(hs1);
		System.out.println(b);
	}

}
