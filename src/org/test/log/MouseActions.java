package org.test.log;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-14\\eclipse\\java-oxygen\\eclipse\\Saranya\\Balaji\\driver\\chromedriver.exe");
	
 
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver.manage().window().maximize();
		
		Actions act= new Actions(driver);
		
		WebElement course= driver.findElement(By.xpath("//a[@class='activeLink']"));
		
		act.moveToElement(course).perform();
		
		WebElement details= driver.findElement(By.xpath("//span[@style='font-size:10px;']"));
		
		act.moveToElement(details).perform();
		
        WebElement train= driver.findElement(By.xpath("//a[@href='http://www.greenstechnologys.com/oracle-course-content.html']"));
		
		act.moveToElement(train).perform();
		
		
	}

}
