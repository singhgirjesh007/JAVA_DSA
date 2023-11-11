package lambda_expression_demo;

/**
 * @author singh
 * 1. Functional interfec can have only one abstract method and multiple deafulat and static method
 * 2.Lambda expression annonymous function with no name , no rturn type and no access modifier
 * 3. Lambda expression can be invoke through Functional interface
 */

@FunctionalInterface
interface Bookable {
	public void cabBook();
}


	class Cab implements Bookable {

	@Override
	public void cabBook() {
		System.out.println("Car is booked");
		
	}
	
	
	
}

public class Lamdademo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bookable ola = new Cab();
		ola.cabBook();
		
		System.out.println();
		//Class code commented it can be easily done throguh Lambda expression
		Bookable ola1 = ()->System.out.println("Car is booked");
		ola1.cabBook();
	}

}
