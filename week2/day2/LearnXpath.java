package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnXpath {

	public static void main(String[] args) throws InterruptedException {
		//Launch browser
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(opt);
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//enter the username
//		WebElement eleUsername = driver.findElement(By.id("username"));
//		eleUsername.sendKeys("DemoCSR");
		//ctrl+2,L- to assign to a variable
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		//click Login button
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		//to get the title
		String title = driver.getTitle();
		System.out.println(title);
		//to click crmsfa link
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[contains(@id,'firstName')]")).sendKeys("Subraja");
		driver.findElement(By.xpath("//input[contains(@id,'lastName')]")).sendKeys("S");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		
		
		
	}

}
