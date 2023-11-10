package object_classes_operations;

public class CallByValueAndCallByRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CallByValueAndCallByRef obj = new CallByValueAndCallByRef();
		int x = 20;
		int y = 30;
		obj.sum(10, 20);
		obj.sum(x, y);
		
	//	obj.sum1(10, 20);
		obj.sum1(x, y);

	}

	public void sum(int a, int b) {

		int c = a + b;
		System.out.println(c);
	}

	public void sum1(int a, int b) {
		 a =40;
		 b = 60;
		int c = a + b;

		System.out.println(c);
	}
}
