package string_stringbuilder_operations;

public class StringCompression {

	public static String stringCompression(String s) {

		String s1 = s.substring(0, 1);
		int i = 1;
		while (i < s.length()) {

			if (s.charAt(i) != s.charAt(i - 1)) {
				s1 += s.charAt(i);
			}
			i++;
		}
		return s1;
	}

	public static String stringCompression2(String s) {

		String s1 = s.substring(0, 1);
		int i = 1;
		int count = 1;
		while (i < s.length()) {
		//	char curr = s.charAt(i);
		//	char prev = s.charAt(i - 1);

			if (s.charAt(i - 1) != s.charAt(i)) {

				if (count > 1) {
					s1 += count;
					count = 1;
				}
				
				s1 += s.charAt(i);
				count = 1;
			}

			else {
				count++;
			}

			i++;
		}
		
		if (count > 1) {
			s1 += count;
			
		}
		
		return s1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String h = stringCompression2("aaahhhjjjddkkdkkccbbbc");
		String d = stringCompression("aaahhhjjjddkkdkkccbbb");

		System.out.println(h);
		System.out.println(d);

	}

}
