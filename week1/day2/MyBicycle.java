package week1.day2;

public class MyBicycle {
	
	public boolean isNew() {
		return false;

	}

	public static void main(String[] args) {
		Bicycle bc = new Bicycle();
		bc.cycleColor("Honda", "Red");
		
		
		MyBicycle mc = new MyBicycle();
		mc.isNew();
		

	}

}
