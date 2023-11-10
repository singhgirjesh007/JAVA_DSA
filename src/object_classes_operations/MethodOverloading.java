package object_classes_operations;

import java.lang.reflect.Method;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Complie time polymorphism
		//decision to resolve which method need to execute at compile time
		//It can be achieved through Method Overloading
		
		
		MethodOverloading mo = new MethodOverloading();
		int i =mo.sum(10,20);
		System.out.println(i);
		mo.sum();
		double d=mo.sum(20d, 30d);
		System.out.println(d);

	}
	
	public void sum() {
		System.out.println("print sum");
		
	}

	/**
	public void sum (int i , int j) {
		int k = i+j;
		System.out.println(k);
	} */
	
	public double sum(double i , double j) {
		return i+j;
	}
	
	public int sum (int i , int j) {
		int k = i+j;
		return k;
	}
	
	//main method can be overloaded
	public static void main(int q) {
		System.out.println(q);
	}
}
