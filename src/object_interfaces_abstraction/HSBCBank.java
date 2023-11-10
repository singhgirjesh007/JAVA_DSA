package object_interfaces_abstraction;

public class HSBCBank implements UsBankRegulations , BrazilBank {
	
	// If a class implementing interface it is mandatory to implement all interface method in class
	// achieving multiple inheritance by implementing two interfaces

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("hsbc --> credit");
	}

	@Override
	public void debt() {
		// TODO Auto-generated method stub
		System.out.println("hsbc --> debit");
	}

	@Override
	public void transfermoney() {
		// TODO Auto-generated method stub
		System.out.println("hsbc --> transfer money");
		
	}
	
	//own method
	public void educationLoan() {
		System.out.println("education loan");
	}

	//Brazil bank interface method
	@Override
	public void mutualFund() {
		// TODO Auto-generated method stub
		System.out.println("from brazil bank interface");
	}

}
