package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWindowHandling {
	//NoSuchWindowException
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		String pTitle = driver.getTitle();
		//switch the control to the new Window
	    String pWindow = driver.getWindowHandle();
	    System.out.println(pWindow);
	    //to get multiple window handles
	    Set<String> windowHandles = driver.getWindowHandles();//insertion order
	    //print the total number of windows opened
	    System.out.println(windowHandles.size());
	    //to print all the window handles
	    for (String each : windowHandles) {
			System.out.println(each);
		}
		
		//Convert Set to list to switch to a required window
	    List<String> listofHandles = new ArrayList<>(windowHandles);
	    //String childWindowHandle = listofHandles.get(1);
	    //switch the control to the child window
	    driver.switchTo().window(listofHandles.get(1));
	    driver.manage().window().minimize();
	    String cTitle = driver.getTitle();
	    if (pTitle.equals(cTitle)) {
			System.out.println("Control stays in the same page");
		}
	    else {
	    	System.out.println("Control switched to the new Window");
	    }
	    driver.close();
	    driver.switchTo().window(pWindow);
	    String title = driver.getTitle();
	    System.out.println(title);

	}

}
