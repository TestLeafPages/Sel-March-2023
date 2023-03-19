package week3.day1;

public class Bajaj extends Auto{

	public void selfStart() {
		System.out.println("From Bajaj class");

	}
	
	
	public static void main(String[] args) {
		Bajaj bj = new Bajaj();
		bj.selfStart();
		bj.applymeter();
		bj.applyBrake();
		bj.soundHorn();
	}
}
