package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnSweetALert {
	//NoAlertPresentException
	//UnhandledAlertException
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Sweet Alert
		driver.findElement(By.xpath("//h5[text()='Sweet Alert (Confirmation)']/following::span[text()='Delete']")).click();
		driver.findElement(By.xpath("//span[text()='Yes']")).click();
		//driver.close();



	}

}
