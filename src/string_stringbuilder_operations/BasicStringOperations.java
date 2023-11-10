package string_stringbuilder_operations;

public class BasicStringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch = new char[5];
		for(int i =0 ; i< ch.length ; i++) {
			ch[i] = 'c';
			
		}
		
		String  sch = new String(ch);
		System.out.println(sch);
		
	//	ch = {'j','a','v','a','z'};
	// any constants can only be used in initializer	
		
		char[] ch1 = {'h','e','l','l','o'};
		
		String s1 = new String(ch1);
	
		String s2  = "hello";
		String s5  = "hello";
		System.out.println(s2);
		
		String s3 = new String("hello");
		System.out.println();
		
		s2.length();
		s1.charAt(1);
		
		for(int i = 0 ; i < s2.length() ; i++) {
			
			
			//System.out.println(s2.charAt(i));
		}
		
		boolean b = s1==s3;
		System.out.println(b);
		
		boolean b1 = s1.equals(s3);
		System.out.println(b1);
		
		System.out.println();
		/**
		 * String addition or concat
		 * after + operator everything dealt as string
		 */
		String s4 = s1 + s3;
		System.out.println(s4);
		
		s4 = s4 + 'w';
		s4 += 10;
		System.out.println(s4);
		
		System.out.println(10 + 20 + s4 + 'd' + 40 + 70);
		
		System.out.println();
		
		/**
		 * String split function
		 * function uses String regex
		 * return String array
		 */
		
		String name = "Girjesh Kumar Singh";
		name.split(" ");
		
		String[] part = name.split(" ");
		
		for(int i = 0 ; i< part.length ; i++) {
			
			System.out.println(part[i]);
		}
		
		System.out.println();
		/**
		 * Concat function
		 * 
		 */
		
		String a = "Anaisha";
		String b11 = " Rajput";
		String b12 = " Ira";
		
		String c = a.concat(b11);
		
		System.out.println(a);
		
		System.out.println(c);
		
		a = a + b12;
		
		System.out.println(a);
		
		
		
		
	}

}
