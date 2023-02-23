package com.example.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowEx02 {
	
	
    public static WebDriver driver;
	public void display()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rashm\\OneDrive\\Documents\\Automation Learning\\CD\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		try
		{
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']")).click();
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/OrangeHRM/']")).click();
		driver.findElement(By.xpath("//a[@href='https://twitter.com/orangehrm?lang=en']")).click();
		driver.findElement(By.xpath("//a[@href='https://www.youtube.com/c/OrangeHRMInc']")).click();
		
		try
		{
			Thread.sleep(2000);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		Set<String> handles = driver.getWindowHandles();
		List<String> ls = new ArrayList<String>(handles);
		
		if(switchToWindow("Facebook", ls))
		{
			System.out.println(driver.getCurrentUrl()+" "+driver.getTitle());
		}
		
		
	}	
		public static boolean switchToWindow(String windowTitle,List<String>ls)
		{
			for(String e:ls)
			{
				String title = driver.switchTo().window(e).getTitle();
				if(title.contains(windowTitle))
				{
					System.out.println("Found the window");
					return true;
				}
			}
			return false;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultipleWindowEx02 testmultiplewindowex02 =  new MultipleWindowEx02();
		testmultiplewindowex02.display();

	}

}
