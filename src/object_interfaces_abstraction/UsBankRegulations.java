/**
 * 
 */
package object_interfaces_abstraction;

/**
 * @author singh
 *Properties of interface
 *1. No method body and only method prototype - Abstract methods
 *2. Variables are by default static and final in nature , No need to define static specifically
 *3. No static methods in interface
 *4. No main method in nature
 *5. Interface is Abstract in nature , 100% Abstraction
 *5. We can not create object of interface means we can not instantiate as no method body no body compilation
 *6. If a class implementing interface it is mandatory to implement all interface method in class
 *7. Variable value can not be change 
 */


public interface UsBankRegulations {
	
	int minbal = 100; // by default public static and final
	
	//No body method with {} this
	public  void credit(); // by default public , abstract
	public void debt();
	public void transfermoney();

}
