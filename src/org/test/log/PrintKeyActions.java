package org.test.log;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PrintKeyActions {

	public static void main(String[] args) throws AWTException {
		
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-14\\eclipse\\java-oxygen\\eclipse\\Saranya\\Balaji\\driver\\chromedriver.exe");
			
			 
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			
			WebElement uname=driver.findElement(By.xpath("//label[@for='pass']"));
			
			Actions act= new Actions(driver);
			
			act.doubleClick(uname).perform();
			act.contextClick(uname).perform();
			
			Robot r= new Robot();
			
			for(int i=0;i<=2;i++)
				
			{
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
					
			}
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			
	}

}
