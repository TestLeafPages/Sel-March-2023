package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseClass{

	
//    @Given("Open the broswer")
//	public void openBrowser() {
//         driver = new ChromeDriver();
//         System.out.println(driver);
//         
//	}
//    
//    @And("Load the url")
//	public void loadUrl() {
//        driver.get("http://leaftaps.com/opentaps/control/main");
//
//	}
    
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
    
    
}
