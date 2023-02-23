package com.example.com;

import java.io.File;
import java.util.*;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;


public class Ex19ScreenShot {
	
	public void display()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rashm\\OneDrive\\Documents\\Automation Learning\\CD\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		
		try
		{
		 Ex19ScreenShot.ScreenShot(driver,"C:\\Users\\rashm\\OneDrive\\Documents\\Automation Learning\\test1.jpeg");
		}
		catch (Exception e) {e.printStackTrace();
		}
	}
	

		public static void ScreenShot(WebDriver driver,String FilePath) throws Exception
		{
			TakesScreenshot capture = ((TakesScreenshot)driver);
			File srsFile = capture.getScreenshotAs(OutputType.FILE);
			File destFile= new File(FilePath);
			Files.copy(srsFile, destFile);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ex19ScreenShot testex19 = new Ex19ScreenShot();
		testex19.display();

	}

}
