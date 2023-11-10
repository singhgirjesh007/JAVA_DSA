package object_classes_operations_inheritance;



public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// dynamic or run time polymorphism as at the compile time java
		//it can be achieved by dynamic binding
		// will decide which method need to call ,
		// like car start method or bmw start method
		// one to many by method overriding

		Bmw b = new Bmw();
		System.out.println(b.i);
		b.start(); // over ridden method

		b.stop(); // inheritance property - super class

		b.theftSafety();
		b.engine(); // inheritance from grand parent (super to super class

		System.out.println();

		Car c = new Car();
		System.out.println(c.j);
		System.out.println(Car.j);
		c.start();
		c.stop();
		c.methodhiding();
		System.out.println("caled throgh class name");
		Car.methodhiding();
		// methodhiding(); static method can be called directly in that class only
		// c.theftSafety(); c can not inherit property of bmw class
		System.out.println();
		System.out.println("dynamic polymorphism");
		
		
		// child class object can be refered by parent class reference variable -
		// dynamic Polymorphism or runtime polymorphism
		// only over ridden methods and parent class method
		// Top casting is dynamic polymorphism
		Car c1 = new Bmw();
		c1.start();
		c1.stop();
		c1.methodhiding();
		
		// big thing can not fit into small thing
		//Parent class object can not be refered by child class reference
		//Bmw b1 = new Car();
		Bmw b1 = (Bmw)new Car();
		
		//it will throw ClassCastException
		//java.lang.ClassCastException:
	}

}
