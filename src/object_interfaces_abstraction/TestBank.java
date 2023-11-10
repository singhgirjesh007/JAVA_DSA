package object_interfaces_abstraction;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int val =UsBankRegulations.minbal ;
		System.out.println(val);
		// UsBankRegulations.minbal = 200; as minval coming from interface and value is final , it can not be chnaged
		
		System.out.println();
		HSBCBank hb = new HSBCBank();
		
		// dynamic polymorphism 
		hb.credit();
		hb.debt();
		hb.transfermoney();
		
		hb.educationLoan();
		
		hb.mutualFund();
		
		System.out.println();
		
		UsBankRegulations ur = new HSBCBank();
		
		//only and only overridden method will be called
		ur.credit();
		ur.debt();

	}

}
