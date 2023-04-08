package week5.day1.testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {
	public ChromeDriver driver;

	@Parameters({"url","username","password"})
	@BeforeMethod(alwaysRun = true)
	public void preCondition(@Optional("http://leaftaps.com/opentaps/control/main")String url,
			@Optional("Demosalesmanager")String uName,@Optional("crmsfa")String pWord) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pWord);
		driver.findElement(By.className("decorativeSubmit")).click();

	}

	@AfterMethod(alwaysRun = true)
	public void postCondition() {
		driver.close();
	}


}
