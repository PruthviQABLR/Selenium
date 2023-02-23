package com.example.com;

import java.awt.Window;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class MultipleWindowHandleEx003 {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rashm\\OneDrive\\Documents\\Automation Learning\\CD\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		String ParentWindowHandle = driver.getWindowHandle();
		System.out.println("Current parent window handle is : "+ParentWindowHandle);
		
		// use java script to scroll down to the bottom of the page
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		// click on Twitter/Facebook/Linkedin/youtube links
		
		WebElement fb = driver.findElement(By.xpath("//a[@href='https://www.facebook.com/OrangeHRM/']"));
				fb.click();
		WebElement yt =driver.findElement(By.xpath("//a[@href='https://www.youtube.com/c/OrangeHRMInc']"));
				yt.click();
		WebElement ln = driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']"));
				ln.click();
		Set<String> handle = driver.getWindowHandles();
		Thread.sleep(5000);
		
		System.out.println("total windows open are :"+handle.size());
		for(String wintab:handle)
		{
			if(!ParentWindowHandle.equalsIgnoreCase(wintab))
			{
				driver.switchTo().window(wintab);
				System.out.println(driver.getTitle());
				String toCheck = driver.getTitle();
				if(toCheck.contains("Facebook"))
				{
					driver.findElement(By.name("email")).sendKeys("Pruthvi");
				}
			}
		}
		Thread.sleep(2000);
		driver.switchTo().window(ParentWindowHandle);
		System.out.println(driver.getTitle());
		

	}

}
