package object_interfaces_abstraction;

/**
 * 
 * @author singh
 *1. In abstract atleast one abstract method  , and need to declare abstract specifically unlike interfaces
 *2. Abstract class can have both abstract and non abstract method
 *3. Hiding the implementation logic
 *4. variables can be final , static or non sttaic variable
 */

public abstract class AbstractionBankExample {
	
	int amt;
	final int rate = 100;
	static int val =20;
	
	public abstract void loan();

	public void loanIntrest() {
		System.out.println("Abstract class");
	}

}
