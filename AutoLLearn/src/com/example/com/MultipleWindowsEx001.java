package com.example.com;

import java.awt.Window;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsEx001 {
	
	public static WebDriver driver;
	
	public static void display()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rashm\\OneDrive\\Documents\\Automation Learning\\CD\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		
		try
		{
			Thread.sleep(2000);
		} catch (InterruptedException e) {e.printStackTrace();}
		
		 
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,document.body.scrollheight)");
		
		
		try
		{
			Thread.sleep(2000);
		} catch (InterruptedException e) { e.printStackTrace();}
		
		
		driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']"));
		driver.findElement(By.xpath("//a[@href='https://www.youtube.com/c/OrangeHRMInc']"));
		driver.findElement(By.xpath("//a[@href='https://twitter.com/orangehrm?lang=en']"));
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/OrangeHRM/']"));
		
		Set<String> handles = driver.getWindowHandles();
		List<String> ls = new ArrayList<String>(handles);
		
		if(switchToWindow("Facebook", ls))
		{
			System.out.println(driver.getCurrentUrl()+" "+driver.getTitle());
		}
	}

		
		public static boolean switchToWindow(String windowTitle, List<String> ls)
		{
			for(String e:ls)
			{
				String title = driver.switchTo().window(e).getTitle();
				if(title.contains(windowTitle))
				{
					System.out.println("Found the correct window");
					return true;
				}
			} return false;
			
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultipleWindowsEx001 testmultiplewindow = new MultipleWindowsEx001();
		testmultiplewindow.display();

	}

}
