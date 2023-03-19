package week3.day2;

public class MyBank extends AxisBank{

	@Override
	public void withDrawLimit() {
		System.out.println("9000000");
		
	}

	@Override
	public void fixedDeposit() {
		System.out.println("5%");
		
	}

	@Override
	public void cibilScore() {
		System.out.println("10%");
		
	}

	@Override
	public void repoRate() {
		System.out.println("4%");
		
	}
	
	public static void main(String[] args) {
		MyBank mb = new MyBank();
		mb.personalLoan();
		mb.knowYourCustomer();
		mb.repoRate();mb.cibilScore();
		mb.fixedDeposit();
	}

}
