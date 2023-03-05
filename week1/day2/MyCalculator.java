package week1.day2;

public class MyCalculator {
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		//to assign to a variable-<ctrl+2->release and then press l
		int totalSum = calc.addThreeNumbers(34, 56,89);
		System.out.println(totalSum);
		
		int mul = calc.multiplyTwoNumbers(45, 567);
		System.out.println(mul);
	}

}
