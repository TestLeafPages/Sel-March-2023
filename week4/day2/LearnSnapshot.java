package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnSnapshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		driver.findElement(By.id("Login")).click();
		WebElement toggleButton = driver.findElement(By.className("slds-icon-waffle"));
		File source1 = toggleButton.getScreenshotAs(OutputType.FILE);
		File dest =  new File("./snaps/toggleimage.png");
		FileUtils.copyFile(source1, dest);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Create']")).click();
		//to take snapshot
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./snaps/salesforce.png");
		FileUtils.copyFile(source, destination);
		
		



	}

}
