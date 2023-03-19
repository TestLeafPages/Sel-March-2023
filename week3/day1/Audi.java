package week3.day1;

public class Audi extends Car{
	
	public void airbag() {
		System.out.println("From Audi Class");
	}
	
	public static void main(String[] args) {
		Audi audi = new Audi();
		audi.airbag();
		audi.soundHorn();
		audi.applyBrake();
		audi.applyGear();
	}
}
