package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class EditLeadsteps extends BaseClass{
	@When("Click FindLeads Link")
	public void clickFindLeadsLink() {
		driver.findElement(By.linkText("Find Leads")).click();

	}
	
	@And("Click PhoneTab")
	public void clickPhoneTab() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();

	}
	
	@Given("Enter the phoneNumber as (.*)$")
	public void enterPhoneNumber(String pNo) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(pNo);

	}
	@When("Click on FindLeads Button")
	public void clickFindLeadsButton() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

	}
	
	@And("Click on FirstLeadId")
	public void clickFirstLeadId() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

	}
	
	@And("Click on Edit button")
	public void clickEditButton() {
		driver.findElement(By.linkText("Edit")).click();

	}
	@Given("Clear and Enter the companyName as (.*)$")
	public void entertheCompanyName(String cName) {
		WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys(cName);

	}
//	@When("Click on SubmitButton")
//	public void clickSubmitButton() {
//		driver.findElement(By.name("submitButton")).click();
//
//	}
	
	@And("ViewLeads should be displayed as (.*)$")
	public void viewLead(String cName) {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains(cName)) {
			System.out.println("Lead is editted successfully");
		}
		else {
			System.out.println("Lead is not editted");
		}

	}
	
	
	


}
