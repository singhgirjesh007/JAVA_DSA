package object_classes_operations;

public class WrapperClassed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "100";
		
		
		//parseInt is method to convert string into Integer - Data conversion
		//parseDouble() , parseFloat , parseBoolen with there respective wrapper classes
		
		String s1 ="true";
		Boolean.parseBoolean(s1);
		
		//Integer is wrapper class
		Integer i =Integer.parseInt(s);
		int j = Integer.parseInt(s);
		
		
		System.out.println();
		
		int m = 10;
		boolean b = true;
		
		
		String.valueOf(m);
		String.valueOf(b);
		
		
		Integer j1 = 30;
		int j2 = j1;
		
		int j3 = 25;
		Integer j4 = j3;
	
	}

}
