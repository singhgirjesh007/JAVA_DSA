package object_classes_operations_inheritance;

public class Car extends Automobile {
	
	int i =10;
	static int j =20;
	
	public static void methodhiding() {
		System.out.println("static method can only be accessible by parent call only method hide");
	}
	
	public void start() {
		
		System.out.println("car --> start");
	}

public void stop() {
		
		System.out.println("car --> stop");
	}

	
}
