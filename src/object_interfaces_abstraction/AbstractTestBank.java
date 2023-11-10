package object_interfaces_abstraction;

public class AbstractTestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractClassUsedByBank hb = new AbstractClassUsedByBank();
		hb.loan();
		hb.loanIntrest(); 
		hb.classMethod();
		
		System.out.println();
		
		AbstractionBankExample ab =new  AbstractClassUsedByBank();
		ab.loan();
		ab.loanIntrest();
		
		//ab.classMethod
	}

}
