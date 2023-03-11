package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class LaunchApplication {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origin=*");
		//to launch the browser
		ChromeDriver driver =  new ChromeDriver(option);
		//to load the url
		driver.get("https://www.amazon.in/");
		//to maximize 
		driver.manage().window().maximize();
		//to close the current window
		driver.close();
		
		
		

	}

}
