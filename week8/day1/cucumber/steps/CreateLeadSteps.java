package steps;

import org.openqa.selenium.By;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadSteps extends BaseClass{
	
	@When("Click on crmsfa link")
    public void clickCrmsfaLink() {
		System.out.println(driver);
    	
    	driver.findElement(By.linkText("CRM/SFA")).click();
    	
	}
    
    @And("Click Leads Link")
    public void clickLeadLink() {
    	driver.findElement(By.linkText("Leads")).click();
    	
   	}
    @And("Click CreateLead Link")
    public void clickCreateLeadLink() {
    	driver.findElement(By.linkText("Create Lead")).click();
    	
   	}
    @Given("Enter the companyName as (.*)$")
    public void enterCompanyName(String cName) {
    	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
    	
   	}
    
    @And("Enter the firstName as (.*)$")
    public void enterFirtsName(String fName) {
		
    	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
   	}
    
    @And("Enter the lastName as (.*)$")
    public void enterLastName(String lName) {
    	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
    	
   	}
    
    @When("Click on CreateLead Button")
    public void clickCreateLeadButton() {
    	driver.findElement(By.name("submitButton")).click();
    	
   	}
    @Then("ViewLeadsPage should be displayed as (.*)$")
    public void verifyViewLeadsPage(String cName) {
    	String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains(cName)) {
			System.out.println("Lead created successfully");
		} else {
			System.out.println("Lead is not created");
		}
    	
   	}

}
