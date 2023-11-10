package object_classes_operations_inheritance;

public class Bmw extends Car  {
	
	
	//Whenver there is a same method in parent class with same name  argument is defined as Method Overriding
	
	public void start() { //over ridden method

		System.out.println("bmw--> start");
	}
	
	
/*	Overridden method can not be more restrictive w.r.t. parent class
 * 
 * 
 * protected void start() { //over ridden method

		System.out.println("bmw--> start");
	}
*/	
	
	public void theftSafety() {
		System.out.println("Bmw --> theft safty");
	}

}
