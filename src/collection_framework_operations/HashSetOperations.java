package collection_framework_operations;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> hs1 = new HashSet<>();
		hs1.add(1);
		hs1.add(2);
		hs1.add(3);
		hs1.add(4);
		hs1.add(5);
		hs1.add(6);
		
		HashSet<Integer> hs2 = new HashSet<>();
		hs2.add(5);
		hs2.add(6);
		hs2.add(7);
		hs2.add(8);
		hs2.add(9);
		
		System.out.println("union");
		HashSet<Integer> union = new HashSet<>(hs1);
		union.addAll(hs2);
		System.out.println(union);
		
		System.out.println(hs1);
		System.out.println(hs2);
		
		System.out.println("intersection");
		HashSet<Integer> intersection = new HashSet<>(hs1);
		intersection.retainAll(hs2);
		System.out.println(intersection);
		System.out.println();
		
		System.out.println(hs1);
		System.out.println(hs2);
		
		System.out.println("diffrence");
		HashSet<Integer> diff = new HashSet<>(hs1);
		diff.removeAll(hs2); // commom values of hs2 will be removed from hs1
		System.out.println(diff);
		
		
		hs1.removeAll(hs2);
		System.out.println(hs1);
		
		Set<Integer> first = new HashSet<Integer>();
		first.addAll(Arrays.asList(new Integer[] {1,2,3,45,66}));
		System.out.println(first);
	}

}
