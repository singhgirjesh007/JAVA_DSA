package string_stringbuilder_operations;

public class StringBuilderOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder("hello");
		
		sb.charAt(1);
		System.out.println(sb.charAt(1));
		
		sb.setCharAt(1, 'd');
		
		System.out.println(sb);
		
		sb.insert(4, 'h');
		
		System.out.println(sb);
		
		sb.deleteCharAt(4);
		System.out.println(sb);

	}

}
