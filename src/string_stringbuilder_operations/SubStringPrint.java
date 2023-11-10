package string_stringbuilder_operations;

public class SubStringPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * substring function concept
		 */
		
		String s = "abcde";
		System.out.println(s.substring(2));
		System.out.println(s.substring(2,2));
		System.out.println(s.substring(0,5));
		
		for(int i = 0; i<s.length(); i ++) {
			
			for(int j = i+1 ; j<=s.length() ; j++) {
				
				
				System.out.println(s.substring(i,j));
			}
			
		}

	}

}
