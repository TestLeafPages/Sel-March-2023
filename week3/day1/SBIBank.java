package week3.day1;

public class SBIBank extends RBI{
	
	public void fixedDeposit() {
		System.out.println("12% interest rate");
	}
	public static void main(String[] args) {
		RBI rb = new RBI();
		rb.fixedDeposit();
		
		SBIBank sbi = new SBIBank();
		
		sbi.fixedDeposit();
	}
}
