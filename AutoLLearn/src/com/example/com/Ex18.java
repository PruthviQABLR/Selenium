package com.example.com;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Ex18 {
	
	
	public static WebDriver driver;
	
	
	public void display()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rashm\\OneDrive\\Documents\\Automation Learning\\CD\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		
		try
		{
		 Ex18.takeSnapshot(driver,"C:\\Users\\rashm\\OneDrive\\Documents\\Automation Learning\\test1.jpeg");
		}
		catch (Exception e) {e.printStackTrace();
		}
	}
		
		
		
		public static void takeSnapshot(WebDriver driver,String fileWithPath) throws Exception
		{
			TakesScreenshot scrShot = ((TakesScreenshot)driver);
			File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
			File destFile = new File(fileWithPath);
			Files.copy(srcFile, destFile);
			
			
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex18 testex18 = new Ex18();
		testex18.display();
		

	}

}
