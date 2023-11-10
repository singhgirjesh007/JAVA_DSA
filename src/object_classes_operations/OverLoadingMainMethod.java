package object_classes_operations;

public class OverLoadingMainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("jvm main method called first");
		main("satyam");
		main(5);

	}
	
	
	public static void main(String args) {
		// TODO Auto-generated method stub
		System.out.println(args);
	}
	
	public static void main(int args) {
		// TODO Auto-generated method stub
		System.out.println(args);
	}
}
