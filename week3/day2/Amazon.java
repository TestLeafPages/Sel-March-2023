package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(opt);
		//Load the url
		driver.get("https://www.amazon.in/");
		//maximize window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//search mobiles in the searchbox
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER);
		List<WebElement> mobilePriceList = driver.findElements(By.className("a-price-whole"));
		List<Integer> list = new ArrayList<>();
		for (WebElement each : mobilePriceList) {
			String text = each.getText();
			//System.out.println(text);
			String replacedString = text.replaceAll(",", "");
			//System.out.println(replacedString);
			if (!replacedString.isEmpty()) {
				int convertedString = Integer.parseInt(replacedString);
				list.add(convertedString);
				
			}
		}
		//to sort a list
		Collections.sort(list);
		int listSize = list.size();
		//list size
		System.out.println(listSize);
		System.out.println(list.get(0));
		//add all the elements of list into Set to remove duplicates
		Set<Integer> unique = new TreeSet<>(list);
	
		System.out.println(unique.size());
		//Confirm
		if (listSize==unique.size()) {
			System.out.println("No Duplicates found");
		}
		else {
			System.out.println("List contains Duplicates");
		}
		
		List<Integer> list1 = new ArrayList<>(unique);
list1.get(0);


	}

}
