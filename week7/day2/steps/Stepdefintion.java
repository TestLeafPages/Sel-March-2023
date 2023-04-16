package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefintion {
    public ChromeDriver driver;
	
    @Given("Open the broswer")
	public void openBrowser() {
         driver = new ChromeDriver();
	}
    
    @And("Load the url")
	public void loadUrl() {
        driver.get("http://leaftaps.com/opentaps/control/main");

	}
    
    @And("Enter the username as {string}")
	public void enterUsername(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);

	}
    
    @And("Enter the password as {string}")
	public void enterPassword(String pWord) {
		driver.findElement(By.id("password")).sendKeys(pWord);

	}
    
    @When("Click on Login button")
	public void clickLoginButton() {

		driver.findElement(By.className("decorativeSubmit")).click();
	}
    
    @Then("HomePage should be displayed")
	public void verifyHomepage() {
         String title = driver.getTitle();
         if (title.contains("Leaftaps")) {
			System.out.println("HomePage is Displayed");
		}
         else {
        	 System.out.println("HomePage is not displayed");
         }

	}
    
    @But("ErrorMessage should be displayed")
    public void verifyErrorMessage() {
		System.out.println("Error message is displayed");

	}
    
    @When("Click on crmsfa link")
    public void clickCrmsfaLink() {
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
    @Then("ViewLeadsPage should be displayed")
    public void verifyViewLeadsPage() {
    	String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		} else {
			System.out.println("Lead is not created");
		}
    	
   	}

}
