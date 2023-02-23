package com.example.com;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsEx002 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rashm\\OneDrive\\Documents\\Automation Learning\\CD\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		String ParentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent window handle is :" +ParentWindowHandle);
		
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> Handles =  driver.getWindowHandles();
		for(String s:Handles)
		{
			System.out.println(s);
			if(!s.equals(ParentWindowHandle))
			{
			driver.switchTo().window(s);
			driver.findElement(By.id("firstName")).sendKeys("Pruthvi");
			Thread.sleep(2000);
			driver.close();
			}
		}
		driver.switchTo().window(ParentWindowHandle);
		driver.findElement(By.id("name")).sendKeys("Pruthvi");
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
