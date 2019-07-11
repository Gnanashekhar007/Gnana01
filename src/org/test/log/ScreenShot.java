package org.test.log;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	
	public static void main(String[] args) throws IOException {
		
	
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-14\\eclipse\\java-oxygen\\eclipse\\Saranya\\Balaji\\driver\\chromedriver.exe");
	
	 WebDriver driver= new ChromeDriver();
	 
	 driver.get("https://www.toolsqa.com/automation-practice-table/");
		
	 driver.manage().window().maximize();

	 TakesScreenshot tk= (TakesScreenshot) driver;
	 
	 File sshot = tk.getScreenshotAs(OutputType.FILE);
	 
	 System.out.println(sshot);
	 
	 File f = new File("C:\\Users\\Greens-14\\Desktop\\Balaji_Outputs\\bala.jpeg");
	 
	 FileUtils.copyFile(sshot, f);

	 
		


	}

}
