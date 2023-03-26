package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnConfirmAlert {
	//NoAlertPresentException
	//UnhandledAlertException
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Confirm  Alert
		driver.findElement(By.xpath("//h5[contains(text(),'Confirm')]/following::span[text()='Show']")).click();
		//step1:Right click and inspect on the alert / Press F12
		//If you could not find the element in the DOM
		//switch the driver control to the alert
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.dismiss();
		String text2 = driver.findElement(By.id("result")).getText();
		if (text2.contains("Cancel")) {
			System.out.println("Alert cancelled");
		}
		driver.close();



	}

}
