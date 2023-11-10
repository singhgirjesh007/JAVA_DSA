package object_classes_operations;

public class Car {
	
	int mod;
	int wheel;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.mod = 2015;
		a.wheel = 4;
		
		b.mod = 2018;
		b.wheel = 4;
		
		c.mod = 2020;
		c.wheel = 4;
		
		System.out.println(a.mod);
		
		a= b; //Now a refer b object
		System.out.println(a.mod);
		
		b=c; // b refer to object c but a still refer old object
		System.out.println(a.mod);
		System.out.println(c.mod);
		
		c=a;
		System.out.println(a.mod);
		System.out.println(c.mod);
		System.out.println(b.mod);
		
	}

}
