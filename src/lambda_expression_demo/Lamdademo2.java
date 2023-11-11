package lambda_expression_demo;

/**
 * @author singh 1. Functional interfec can have only one abstract method and
 *         multiple deafulat and static method 2.Lambda expression annonymous
 *         function with no name , no rturn type and no access modifier 3.
 *         Lambda expression can be invoke through Functional interface
 */

@FunctionalInterface
interface Bookable1 {
	public String cabBook(String str, String str2);

}

class Cab1 implements Bookable1 {

	@Override
	public String cabBook(String str, String str2) {
		System.out.println(str + " " + str2);
		return "price = 500";

	}

}

public class Lamdademo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bookable1 ola = new Cab1();
		System.out.println(ola.cabBook("Bingo", "tingo"));
		
		
		System.out.println();
		
		// Class code commented it can be easily done throguh Lambda expression , No need to create class and method implementation
		Bookable1 ola1 = (str, str2) -> {
			System.out.println(str + " "+str2);
			return "price = 500";

		};
		
		System.out.println(ola1.cabBook("babu", "tinku"));
	}

}
