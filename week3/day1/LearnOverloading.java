package week3.day1;

public class LearnOverloading {

	public void add(int a, int b) {
		System.out.println(a+b);
		
	}
	
	public float add(float a, float b) {
		return a+b;

	}
	
	public void add(int a, int b,int c) {
		System.out.println(a+b);
		
	}
	
	
	public void add(int a, int b,int c,float d) {
		System.out.println(a+b);
		
		
	}
	public static void main(String[] args) {
		LearnOverloading lo = new LearnOverloading();
		
		lo.add(23, 45, 56, 7.9f);
		float add = lo.add(23, 4.7f);
		System.out.println(add);
	}
	
}
