package com.example.com;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class AlertExample001 {
	
	public static WebDriver driver;
	
	public void display()
	
	{    // set chrome driver properties
		// launch URL
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rashm\\OneDrive\\Documents\\Automation Learning\\CD\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		
		//wait till the page load
		
		try
		{
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// scroll to the bottom of the page
		
		
		JavascriptExecutor jr = (JavascriptExecutor) driver;
		jr.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Click on FB/Insta/Link/twitter icons.
		
		driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']")).click();
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/OrangeHRM/']")).click();
		driver.findElement(By.xpath("//a[@href='https://www.youtube.com/c/OrangeHRMInc']")).click();
		driver.findElement(By.xpath("//a[@href='https://twitter.com/orangehrm?lang=en']")).click();
		
		// put all the windows in the set
		Set<String> handles = driver.getWindowHandles();
		
		// move all the handles to list
		
		List<String> hlist = new ArrayList<String>(handles);
		
		System.out.println(hlist.size());
		
		System.out.println(hlist.toString());
	
	if(switchToWindow("Facebook", hlist))
	{
		System.out.println(driver.getCurrentUrl()+" "+driver.getTitle());
		
		driver.findElement(By.name("email")).sendKeys("test");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}

    public static boolean switchToWindow(String windowTitle, List<String> hlist) 
    {
    for(String e:hlist)
    {
    	String title = driver.switchTo().window(e).getTitle();
    	if(title.contains(windowTitle))
    	{
    		System.out.println("Found the correct window");
    		return true;
    	}
    }
    return false;
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AlertExample001 testAlertExample001 = new AlertExample001();
		testAlertExample001.display();

	}

}
