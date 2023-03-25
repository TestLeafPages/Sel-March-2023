package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnFramebyIndex {
	//NoSuchFrameException
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//switch the control to the frame
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		//to come out of the frame
		driver.switchTo().defaultContent();
		//to switch to the nested frame
		driver.switchTo().frame(2);//parent frame
		WebElement eleFrame = driver.findElement(By.xpath("//iframe[@id='frame2']"));//child frame
		//driver.switchTo().frame("frame2");//nested frame
		driver.switchTo().frame(eleFrame);
		driver.findElement(By.id("Click")).click();
		
		


	}

}
