package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnAlert {
	//NoAlertPresentException
	//UnhandledAlertException
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Simple Alert
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		//step1:Right click and inspect on the alert / Press F12
		//If you could not find the element in the DOM
		//switch the driver control to the alert
		Thread.sleep(3000);
		Alert simpleAlert = driver.switchTo().alert();
		//read the text of the alert
		String alertText = simpleAlert.getText();
		System.out.println("Alert message : "+alertText);
		//accept the alert
		simpleAlert.accept();

		//to confirm
		String text = driver.findElement(By.id("simple_result")).getText();
		System.out.println(text);



	}

}
