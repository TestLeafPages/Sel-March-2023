package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindLinks {

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(opt);
		//Load the url
		driver.get("https://www.facebook.com/");
		//maximize window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//find the number of links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		//to find the total number of links
		int size = links.size();
		System.out.println("The total number of links in this page is :"+ size);
		//to find the second link
		WebElement secondLink = links.get(2);
		System.out.println(secondLink);
		String text = secondLink.getText();
		System.out.println(text);
		//Declare a List
		List<String> list = new ArrayList<>();
		//to print all the links
//		for (int i = 0; i < size; i++) {
//			String allLinks = links.get(i).getText();
//			//System.out.println(allLinks);
//			linkList.add(allLinks);
//		}
	//       datatype   variable: data	
		for (WebElement each : links) {
			String linkNames = each.getText();
			list.add(linkNames);
		}
		
		Collections.sort(list);
		System.out.println(list);
		
		

	}

}
