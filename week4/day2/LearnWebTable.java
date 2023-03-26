package week4.day2;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWebTable {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.leafground.com/table.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//to fetch a single data from the webtable
		String text = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[1]/td[1]")).getText();
		System.out.println(text);
		//to find the number of rows 
		List<WebElement> allRows = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr"));
		//to find the number of columns
		List<WebElement> allColumns = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-header-box']/table/thead/tr/th"));
		for (int i = 1; i <=allRows.size(); i++) {
			for (int j = 1; j <=allColumns.size(); j++) {
			String text2 = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
			System.out.println(text2);
		}
		}
        


	}

}
