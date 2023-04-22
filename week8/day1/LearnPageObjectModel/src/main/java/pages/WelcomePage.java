package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class WelcomePage extends BaseClass{
	
	public WelcomePage verifyWelcomePage() {
		String title = driver.getTitle();
		if (title.contains("Leaftaps")) {
			System.out.println("Login successful");
		}
		else {
			System.out.println("Login not successful");
		}
		return this;

	}
	
	public MyHomePage clickCrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();

	}
	

}
