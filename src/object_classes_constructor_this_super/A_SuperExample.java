package object_classes_constructor_this_super;

/**
 * 
 * @author singh
 *Once object created it will go to parent class and check for default constructoor
 */

public class A_SuperExample extends ConstructorConcept {
	
	A_SuperExample(){
		System.out.println("child class");
	}
	
	A_SuperExample(int i){
		
		super(10,20);
		System.out.println("child class");
	}
	
	public static void main(String[] args) {
		
		
		A_SuperExample child = new A_SuperExample();
		System.out.println();
		A_SuperExample child_par = new A_SuperExample(5);
	}
}
