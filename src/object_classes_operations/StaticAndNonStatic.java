package object_classes_operations;

public class StaticAndNonStatic {
	
	static int i =25;
	public static int num = 30;
	int j =40;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticAndNonStatic s1 = new StaticAndNonStatic();
		StaticAndNonStatic s2 = new StaticAndNonStatic();
		
		System.out.println(i );
		StaticAndNonStatic.sum();
		
		s1.sum(10);
		//i can be called directly 
		//sttaic method can be called directly or by class name 
		//sttaic variable can be called by classname
		System.out.println(StaticAndNonStatic.i);
		int t = StaticAndNonStatic.i;
		//StaticAndNonStatic.i; - it will throw error
		//or by object reference but it will get warning as it should be called in static way, it should call directly or by class name
		
		s1.i = 30;
		s1.j =40;
		s2.j =60;
		
		
		System.out.println(i + " "+ s1.j +  " " +s2.j);
		//Once object chnage the value of static variable it will retain it value
		s2.i =20;
		s1 =s2;
		System.out.println(i + " "+ s1.j +  " " +s2.j);
		System.out.println(i + " "+ s1.i +  " " +s2.i);
		
	}
	
	public static void sum() {
		System.out.println("sum1");
	}
	
/*	
 * Duplicate method
 * public static int sum() {
		System.out.println("sum1");
		return 1;
	}
*/	
	public  void sum(int n) {
		System.out.println("sum");
	}

}
