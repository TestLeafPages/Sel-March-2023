package week3.day2;

public class SBIBank implements RBI{

	@Override
	public void withDrawLimit() {
		
		System.out.println("10000000");
	}

	@Override
	public void knowYourCustomer() {
		System.out.println("AADHAR");
	}


	public void fixedDeposit() {
		System.out.println("5 years");
		
	}

	public void goldLoan() {
	    System.out.println("3 lakhs");	
   
	}
	@Override
	public void cibilScore() {
		// TODO Auto-generated method stub
		
	}
		
	
	
public static void main(String[] args) {
	SBIBank sbi = new SBIBank();
	sbi.fixedDeposit();
	sbi.knowYourCustomer();
	sbi.withDrawLimit();
	sbi.goldLoan();
}



}
