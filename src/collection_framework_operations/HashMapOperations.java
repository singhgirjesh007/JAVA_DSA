package collection_framework_operations;

/**
 * 	HashMap is a class which implements Map interface
 * 
 *  interface Entry<K, V> {
    Returns the key corresponding to this entry.  K getKey(); V getValue();
    Set<K> keySet();
    HashMap maintian no order
    It is non synchronize - not thread safe
    Chance of concureent modifcation exception - fail fast condiiton key
    It may have one null key and multiple null values
    if removal happen - no shifitng of key , it's just remove key
 * 
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Map<String,Integer> map = new Map<>(); Map is an interface , can not instantiate
		
//		Map<String,Integer> map = new HashMap<>(); --> can use as HashMap is class
		
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "Selenium");
		hm.put(2, "testcomplete");
		hm.put(3, "playright");
		hm.put(4, "playright");
		
		
		
		
		HashMap<Integer, String> hm1 = new HashMap<>();
		hm1 = (HashMap<Integer, String>) hm.clone();
		
		hm1.remove(1);
		System.out.println(hm);
		System.out.println();
		
		System.out.println(hm1);
		System.out.println();
		
		hm1.clear(); //delete all element
		System.out.println(hm1);
		System.out.println();
		
		
		
		System.out.println(hm.get(1));  //It will return corresponding key value
		System.out.println(hm.get(9));	//If key doesn't exist , return null value 
		
		System.out.println(hm.remove(1)); // return key vale and remove it from hashmap
		System.out.println();
		
		boolean k1 = hm.containsKey(1);
		boolean v1 = hm.containsValue("Selenium");
		
		hm.put(1, "Selenium");
		System.out.println();
		
		Set<Entry<Integer,String>> etr =hm.entrySet();
		
		System.out.println("Iteration of HashMap through entrySet()");
		for (Entry<Integer, String> m : hm.entrySet()) {
			
			System.out.println(m.getKey() + " " + m.getValue() + " ");
			
		}
		
		
		System.out.println();
		System.out.println("Iteration of HashMap through lambda expression");
		hm.forEach((k,v) -> {
			System.out.println("Key " + k + " value " + v);
			
		});
		
		
		System.out.println();
		System.out.println("Iteration of HashMap through Iterator");
		 Iterator<Entry<Integer, String>> itr = hm.entrySet().iterator();
		while(itr.hasNext()) {
			
			Entry<Integer, String> ma = itr.next();
			System.out.println(ma.getValue() + " " + ma.getKey());
		}
		
		 
		System.out.println();
		System.out.println("Defining class Object in map");
	
		HashMap<Integer , Employee> hme = new HashMap<>();
		
		Employee e1 = new Employee("tom", 4, "mech");
		Employee e2 = new Employee("hank", 5, "cs");
		
		hme.put(1, e1);
		hme.put(2, e2);
		
		for (Entry<Integer , Employee> m : hme.entrySet()) {
			
			
			Employee emp =  m.getValue();
			System.out.println(m.getKey() + " " + emp.age + " "+ emp.name + " " + emp.dept);
		}
		
	//	Concept of null , see the print to under stand
		hm.put(null, null);
		hm.put(null, null);
		hm.put(4, null);
		
		System.out.println();
		System.out.println(hm);
		System.out.println();
		
		System.out.println("Iteration of HashMap through entrySet()");
		for (Entry<Integer, String> m : hm.entrySet()) {
			
			System.out.println(m.getKey() + " " + m.getValue() + " ");
			
		}
		
		System.out.println();
		Set s =hm.entrySet();
		System.out.println(s);
		
		boolean b = hm.equals(hm1);
		
		//get the hashcode
		System.out.println(hm.hashCode());
		
		//iteration through lamda expression
		
		
	}

}
