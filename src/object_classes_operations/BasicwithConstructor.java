package object_classes_operations;

public class BasicwithConstructor {
	
	public static class Person {
		int age;
		String name ;
		
		void saysHi () {
			System.out.println(name + "  " + age);
		}
		
		
		//java provide default constructor
		//But if one parameterized constructor defined , deafult need to be declared otherwise no need to declare default
		Person(){
			
		}
		
		//parametrized constructor
		Person (int age , String name) {
			this.age = age ;
			this.name = name ;
			
		}
	}
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.age = 10;
		p1.name = "A";
		
		Person p2 = new Person(30 , "C");
	}

}
