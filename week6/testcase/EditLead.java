package week5.day1.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EditLead extends BaseClass{
// ArrayOfString(dataType)   packageName.Classname.MethodName
	@Test(dataProvider = "sendData")//(groups="Smoke")//dependsOnMethods = {"week5.day1.testcase.CreateLead.runCreateLead"},alwaysRun = true) 
	public  void runEditLead(String pNo,String cn) throws InterruptedException {
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(pNo);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys(cn);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains(cn)) {
			System.out.println("Lead is editted successfully");
		}
		else {
			System.out.println("Lead is not editted");
		}
		


	}
	
	@DataProvider
	public String[][] sendData() {
      //create 2-dimensional array     rowCountcolumnCount		
		String[][] data = new String[3][2];
		//1st set of data
		data[0][0]  = "99";
		data[0][1]  = "TL";
		
		
		//2nd set of data
		data[1][0]  = "91";
		data[1][1]  = "IN";
		
		data[2][0]  = "9";
		data[2][1]  = "WI";
		
		
		return data;
		
		
	}

}
