package object_interfaces_abstraction;

public class AbstractClassUsedByBank extends AbstractionBankExample {

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("class method over riden");
	}
	
	public void classMethod() {
		System.out.println("class method");
	}

}
