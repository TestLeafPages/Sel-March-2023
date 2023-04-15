package week7.day1;

public class LearnConstructor {
	
	
	int empId;
	String empName;
	boolean empStatus;
	
	LearnConstructor(){
		this(200, "Subraja", true);
		System.out.println("Default  constructor");
		empId=100;
		empName="Subraja";
		empStatus=true;
	}
	
	LearnConstructor(int empId,String empName,boolean empStatus){
		//this();
		System.out.println("Parameterized constructor");
		
		this.empId=empId;
		this.empName=empName;
		this.empStatus=empStatus;
	}
	
	
	public static void main(String[] args) {
		LearnConstructor lc = new LearnConstructor();
		System.out.println(lc.empId);
		System.out.println(lc.empName);
		System.out.println(lc.empStatus);
	}
	

}
