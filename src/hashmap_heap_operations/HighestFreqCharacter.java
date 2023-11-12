package hashmap_heap_operations;

import java.util.HashMap;
import java.util.Map;

public class HighestFreqCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abrakabdgggggggggggg";
		
		Map<Character,Integer> map = new HashMap<>();
		
		
		for(int i =0 ; i<str.length(); i++) {
			char ch =str.charAt(i);
			if(map.containsKey(ch)) {
				int inx = map.get(ch);
				inx++;
				map.put(ch, inx);
			}else {
			map.put(ch, 1);
			}	
		}
		
		System.out.println(map);
		
		char mfc = str.charAt(0);
		for ( char ch :  map.keySet()) {
			
			if (map.get(ch) > map.get(mfc)) {
				mfc = ch;
			}
			
		}
		
		System.out.println(mfc);
	}

}
