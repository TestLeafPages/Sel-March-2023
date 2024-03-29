package challenges;

import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {

	@Test
	public void upload() throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		String path = System.getProperty("user.dir"); //project path

		System.out.println(path); 

		  driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		  //Absolute path of the file
		  driver.findElement(By.id("resumeUpload")).sendKeys(path+"\\data\\V. Gomathy Shri_ Resume.pdf"); // absolute path
		 
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}
}