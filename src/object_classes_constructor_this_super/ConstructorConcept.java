package object_classes_constructor_this_super;

/**
 * 
 * @author singh
 *
 *1.If parameterized constructor is defined in call , default construct need to be decalred
 *other wise compile time error will come
 *2.In parameterized constructor name and int are local variable
 *3. name on left side is global variable and name on right side is local variable
 *4. "this" will point to global variable to distinguish and without "this" it will not work
 *5. this.classVar = localvar
 *6. this() is use to invoke current class default constructor and it should always be first statement
 */

public class ConstructorConcept {

	String name;
	int age;
	
	void display() {
		System.out.println("this keyword used to invoke current class method");
	}
	
	

	public ConstructorConcept() {
		// TODO Auto-generated constructor stub

		System.out.println("hello");
	}

	public ConstructorConcept(int i) {
		// TODO Auto-generated constructor stub
		this();
	//	this(10,20); two constructor can not be called as this() should be always first statement
		System.out.println("1st paramterized constructor" + i);
	}
	
	public ConstructorConcept(int i, int j) {
		// TODO Auto-generated constructor stub
		System.out.println("2nd paramterized constructor" + i + j);
	}
	// In parameterized constructor name and int are local variable
	// name on left side is global variable
	// name on right side is local variable
	// if parameterized constructor have same variable name ,
	// "this" will point to global variable to distinguish and without "this" it will not work
	// 
	public ConstructorConcept(String name, int age) {
		// TODO Auto-generated constructor stub
		System.out.println("this usage");
		this.name = name;
		age = age;
	}
	
	
	/**
	 * Concept
	 * If constructor variable argument name is diffrent than glbal/instance variable , without this it will work
	 * 
	public ConstructorConcept(String n1, int a1) {
		// TODO Auto-generated constructor stub
		this.name = n1;
		age = a1;
	}
	*/
	
	public static void main(String[] args) {

		ConstructorConcept obj = new ConstructorConcept();
		System.out.println();
		ConstructorConcept obj1 = new ConstructorConcept(5);
		System.out.println();
		ConstructorConcept obj2 = new ConstructorConcept("tom", 10);
		ConstructorConcept obj3 = new ConstructorConcept(20, 10);


		System.out.println();
		System.out.println(obj2.name);
		System.out.println(obj2.age);
		
		// update obj2 value
		obj2.name = "babbu";
		System.out.println();
		System.out.println(obj2.name);
		
		System.out.println();
		obj.name = "Mayank";
		System.out.println(obj.name);
	}
}
