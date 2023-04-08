package week5.day1.testcase;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass{

	@Test(dataProvider = "sendData")   //(groups={"Smoke","Functional"})
	public void runCreateLead(String cName,String fName,String lName,String pNo) {
        System.out.println(driver);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pNo);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		} else {
			System.out.println("Lead is not created");
		}
	}

	@DataProvider
	public String[][] sendData() {
      //create 2-dimensional array     rowCountcolumnCount		
		String[][] data = new String[2][4];
		//1st set of data
		data[0][0]  = "TestLeaf";
		data[0][1]  = "Subraja";
		data[0][2]  = "Subi";
		data[0][3]  = "99";
		
		//2nd set of data
		data[1][0]  = "QEagle";
		data[1][1]  = "Vidhya";
		data[1][2]  = "R";
		data[1][3]  = "91";
		
		return data;
		
		
	}
	
}
