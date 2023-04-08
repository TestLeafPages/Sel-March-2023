package week5.day1.testcase;

import org.testng.annotations.Test;

public class NewTest {
 
  
  @Test(priority = -1)
  public void editLead() {
	  System.out.println("Edit Lead");
  }
  
  
  @Test(priority = 1)
  public void createLead() {
	  System.out.println("Create Lead");
  }
  
  @Test(priority = 3)
  public void deleteLead() {
	  System.out.println("Delete Lead");
  }
  
  @Test(priority = 1)
  public void duplicateLead() {
	  System.out.println("Duplicate Lead");
  }
}
