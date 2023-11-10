package collection_framework_operations;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> ar = new ArrayList<>();

		ar.add(50);
		ar.add(30);
		ar.add(50);

		System.out.println(ar.size());

		System.out.println(ar.get(2)); // Pass index
//		System.out.println(ar.get(5)); java.lang.IndexOutOfBoundsException: Index 5 out of bounds for length 3

		ar.remove(0);

		System.out.println(ar.contains(50));

		System.out.println(ar);
		System.out.println();

		// Iteration in Array
		System.out.println("through foreach loop");
		for (int val : ar) {
			System.out.print(val + " ");
		}

		System.out.println();
		System.out.println("uisng for loop with size method");
		System.out.println("size of an array list ---> " + ar.size());
		for (int i = 0; i < ar.size(); i++) {
			System.out.print(ar.get(i) + " ");
		}

		
		System.out.println();
		System.out.println("Using iterartor" + "\n");
		Iterator<Integer> itr_ar = ar.iterator();
		while (itr_ar.hasNext()) {
			System.out.print(itr_ar.next() + " ");
		}

		
		System.out.println();
		System.out.println("Array list through class object");
		// Employee class Object
		Employee e1 = new Employee("tom", 4, "mech");
		Employee e2 = new Employee("hank", 5, "cs");

		ArrayList<Employee> arrList = new ArrayList<>();

		arrList.add(e1);
		arrList.add(e2);

		
		System.out.println();
		System.out.println(arrList);

		// Iterator to traverse the values
		Iterator<Employee> itr = arrList.iterator();
		while (itr.hasNext()) {
			Employee emp = itr.next();
			System.out.println(emp.name + " " + emp.age + " " + emp.dept);
		}

		System.out.println();

		ArrayList<String> ar1 = new ArrayList<>();
		ar1.add("Test");
		ar1.add("QTP");

		ArrayList<String> ar2 = new ArrayList<>();
		ar2.add("Test1");
		ar2.add("QTP1");

		ar1.addAll(ar2); // add all list member of ar2
		
		System.out.println();
		System.out.println("addAll function");
		for (String val : ar1) {
			System.out.println(val + " ");
		}
		
		System.out.println();
		System.out.println("retailAll function --> intersection part");
		ar1.retainAll(ar2);
		Iterator<String> str = ar1.iterator();
		while (str.hasNext()) {

			System.out.println(str.next());
		}

		System.out.println();
		System.out.println("removeAll function");
		ar1.removeAll(ar2); // remove all member of arr2
		for (String val : ar1) {
			System.out.println(val + " ");
		}
		
		

		

		System.out.println();
		System.out.println("Lambda expression with forEach");

		ar.forEach(val -> {
			System.out.println(val);
		});
		
		System.out.println();
		System.out.println("Java 8 lamda and forEachRemaining() method");
		Iterator<Integer> itr2 = ar.iterator();
		itr2.forEachRemaining(shows-> {
			System.out.println(shows);
		}
		);
		
	}

}
