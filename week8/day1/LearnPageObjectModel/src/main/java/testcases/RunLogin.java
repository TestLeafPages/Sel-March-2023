package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class RunLogin extends BaseClass{

	@Test
	public void verifyLogin() throws InterruptedException {
		System.out.println(driver);
	 LoginPage lp = new LoginPage();
	 lp.enterUsername()
	 .enterPassword()
	 .clickLoginButton()
	 .verifyWelcomePage();
	
     
	}
	
}
