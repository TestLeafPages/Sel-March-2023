package week7.day1;

public class LearnStaticMethod {
	
	
	
	public static void main(String[] args) {
		System.out.println("I am inside main method");
		//ClassName.methodName
		EmployeeInfo.getDetails();
	}
	static {
		System.out.println("I am a static block");
	}
}
