package string_stringbuilder_operations;

public class PalindromicSubStrings {
	
	public static boolean isPalindrome(String s) {
		
		int i =0;
		int j = s.length() -1;
		boolean flag = true; ;
		
		while(i <= j) {
			
			if (s.charAt(i) != s.charAt(j)) {
				  flag = false;
				  break;
			}
			else
			{
				i++;
				j--;
			}
			
		}
		
		return flag;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abccbc";
		
		for(int i =0 ; i<s.length(); i++) {
			
			for (int j = i+1 ; j<=s.length() ; j++) {
				
			//	String ss =s.substring(i,j);
				
				if(isPalindrome(s.substring(i,j))){
					System.out.println(s.substring(i,j));
				}
				
				
			}
		}

	}

}
