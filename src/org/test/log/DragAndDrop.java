package org.test.log;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-14\\eclipse\\java-oxygen\\eclipse\\Saranya\\Balaji\\driver\\chromedriver.exe");
		
		 
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		
		WebElement uname=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		
		WebElement dest=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		Actions act= new Actions(driver);
		
		act.dragAndDrop(uname, dest).perform();
		
		
		
	}

}

