package object_classes_operations;

public class SwapGame {

	public static class Person {
		int age;
		String name;

		void saysHi() {
			System.out.println(name + "[" + age + "say hi ]");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		Person p2 = new Person();

		p1.age = 10;
		p1.name = "A";
		p2.age = 20;
		p2.name = "B";

		p1.saysHi();
		p2.saysHi();

		System.out.println();
		// Person p3 = p1 ;
		// p3.age = 30;
		swap(p1, p2);
		p1.saysHi();
		p2.saysHi();

		System.out.println();

	//	swap1(p1, p2);
		p1.saysHi();
		p2.saysHi();

		System.out.println();

		swap2(p1, p2);
		p1.saysHi();
		p2.saysHi();

	}

	public static void swap(Person psn1, Person psn2) {
		Person temp = psn1;
		psn1 = psn2;
		psn2 = temp;
	}

	public static void swap1(Person psn1, Person psn2) {
		int age = psn1.age;
		psn1.age = psn2.age;
		psn2.age = age;

		String name = psn1.name;
		psn1.name = psn2.name;
		psn2.name = name;
	}

	public static void swap2(Person psn1, Person psn2) {

		psn1 = new Person();

		int age = psn1.age;
		psn1.age = psn2.age;
		psn2.age = age;

		psn2 = new Person();

		String name = psn1.name;
		psn1.name = psn2.name;
		psn2.name = name;
	}
}
