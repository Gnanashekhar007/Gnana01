package org.test.log;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableData {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-14\\eclipse\\java-oxygen\\eclipse\\Saranya\\Balaji\\driver\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		 
		 driver.get("https://www.toolsqa.com/automation-practice-table/");
			
		 driver.manage().window().maximize();

		 List <WebElement> tRow= driver.findElements(By.tagName("tr"));
		 
		 for(WebElement row: tRow)
			 
		 {
		 
			 List <WebElement> tData = row.findElements(By.tagName("td"));
			 
			 for(WebElement data: tData)
				 
			 {
				 String text = data.getText();
				 System.out.println(text);
			 }
	}
	}
}

