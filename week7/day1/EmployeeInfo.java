package week7.day1;

public class EmployeeInfo {

	int empId;
	String empName;
   static String companyName;
    
    public void setValues(int id,String name,String cName) {
		empId=id;
		empName=name;
		companyName = cName;

	}
    
    public void printValues() {
		System.out.println(empId+" " +empName +"  " +companyName);
	}
    
    public static void getDetails() {
    	System.out.println("I am a static method");
    }
    
    public static void main(String[] args) {
    	
    	getDetails();
    	
    	EmployeeInfo emp1 = new EmployeeInfo();
    	emp1.setValues(100, "Subraja", "TestLeaf");
    	emp1.printValues();
    	System.out.println("*************************");
    	EmployeeInfo emp2 = new EmployeeInfo();
    	emp2.setValues(200, "Vidhya", "Qeagle");
    	emp1.printValues();
    	emp2.printValues();
	}
}
