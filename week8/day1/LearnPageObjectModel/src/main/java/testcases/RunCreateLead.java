package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class RunCreateLead extends BaseClass{

	
	@Test
	public void runCreateLead() throws InterruptedException {
		LoginPage lp = new LoginPage();
		lp.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.verifyWelcomePage()
		.clickCrmsfa()
		.clickLeadButton()
		.clickCreateLead()
		.enterCompanyName()
		.enterFirstName()
		.enterLastName()
		.clickSubmitButton()
		.verifyViewLeadsPage();
	}
}
