package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownUsingSelect {

	public static void main(String[] args) throws InterruptedException {
		//Launch browser
		ChromeDriver driver = new ChromeDriver();
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize window
		driver.manage().window().maximize();
		//enter the username
//		WebElement eleUsername = driver.findElement(By.id("username"));
//		eleUsername.sendKeys("DemoCSR");
		//ctrl+2,L- to assign to a variable
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		//enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click Login button
		Thread.sleep(3000);
		driver.findElement(By.className("decorativeSubmit")).click();
		//to get the title
		String title = driver.getTitle();
		System.out.println(title);
		//to click crmsfa link
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subraja");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		//DropDrown
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		//if the dropdown is inside a Select tag in the Dom
		Select sec = new Select(sourceDD);
		//3 methods Of Select class
		//selectByIndex()-random order based on the index
		//sec.selectByIndex(2);
		
		//selectByValue()-
		//sec.selectByValue("LEAD_TRADESHOW");
		
		//selectByVisibleText()-
		sec.selectByVisibleText("Public Relations");
		//driver.findElement(By.name("submitButton")).click();
		
		
		
		
	}

}
