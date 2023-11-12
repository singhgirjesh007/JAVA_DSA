package hashmap_heap_operations;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class PrintCoomonValueArrValueTimes {
	
	public static void commomElementofArray(int[] arr , int[] arr2) {
		Set<Integer> set = new HashSet<>();
		for(int i =0; i<arr.length ; i++) {
			for(int j =0 ; j<arr2.length ;j++) {
				
				if (arr[i]== arr2[j]) {
					set.add(arr[i]);
				}
			}
		}
		
		System.out.println(set);
		
	}
	
	public static HashMap<Integer,Integer> maxOccur(int[] arr){
		HashMap<Integer,Integer> map = new HashMap<>();
		
		
		for(int i =0; i<arr.length ;i++) {
			
			if(map.containsKey(arr[i])) {
				
				//map.get(arr[i])++ will not work as it's constant vale and ++ is assignment operator which require variable
				
				int occu =map.get(arr[i]);
				occu++;
				map.put(arr[i], occu);
			}else {
			map.put(arr[i], 1);
			}
		}
		
		return map;
	}
	
	public static void commomElementofArray1(int[] arr , int[] arr2) {
		
		HashMap<Integer,Integer> fmap =maxOccur(arr);
		
		for(int j =0 ; j<arr2.length ; j++) {
			
			if (fmap.containsKey(arr2[j])) {
				
				System.out.print(arr2[j]+ " ");
				int fre =fmap.get(arr2[j]);
				fre--;
				if(fre >0) {
				fmap.put(arr2[j], fre);	
				}
				else {
					fmap.remove(arr2[j]);
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 1,2,4,2,3,3,4,9,6,5,2,4};
		int[] arr2 = {2,2,3,5,4,3,3,3,5};
		
		commomElementofArray1(arr, arr2);

	}

}
