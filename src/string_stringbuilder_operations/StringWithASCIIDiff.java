package string_stringbuilder_operations;

public class StringWithASCIIDiff {
	
	
	public static String solution(String s) {
		
		StringBuilder sb = new StringBuilder();
		
			 sb.append(s.charAt(0)) ;
		
		for(int i = 1; i<s.length() ; i++) {
			
			char curr = s.charAt(i);
			char prev = s.charAt(i-1);
			
			int diff = curr - prev;
			
			sb.append(diff);
			sb.append(curr);
			
			
			
		}
		
		
		return sb.toString();
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "agdhisab";
		
		System.out.println(solution(s));

	}

}
