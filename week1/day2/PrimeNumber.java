package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int input = 131;
		boolean bPrime = true;
		for (int i = 2; i < input; i++) {
			if (input%i==0) {//13%2==0
				System.out.println("Non Prime");
				bPrime = false;
				break;
			}
		}
		if (bPrime) {
			System.out.println("Prime Number");
			
		}
	}

}
