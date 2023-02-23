package com.example.com;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertEx002 {

	//Step 1 to launch multiple windows
	// declare webdriver as global public static variable cause u should access driver in all the methods
	
	public static WebDriver driver;
	
	public void display()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rashm\\OneDrive\\Documents\\Automation Learning\\CD\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		//driver.get("D:\\xpathaxes.html");
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		driver.manage().window().maximize();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// reaching bottom of the webpage
		JavascriptExecutor js = (JavascriptExecutor) driver;
        //Scroll down till the bottom of the page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        
        
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']")).click();
		
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/OrangeHRM/']")).click();
		
		driver.findElement(By.xpath("//a[@href='https://twitter.com/orangehrm?lang=en']")).click();
		
		
		// Step 2 put all the windows in Set
		
		Set<String> handles= driver.getWindowHandles();
		
		// put all the windows in list
		
		List<String> hList= new ArrayList<String>(handles);
		
		
		// step 4 Call the switchToWindow method inside display method 
		// Pass the window title as string parameter 
		
		if(switchToWindow("Facebook", hList))
		{
			System.out.println(driver.getCurrentUrl()+" "+driver.getTitle());
			
			driver.findElement(By.name("email")).sendKeys("Ram");
			
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.findElement(By.xpath("//*[@id='mount_0_0_pz']/div/div[1]/div/div[3]/div/div/div/div[1]/div[2]/div/div/div/div[2]/div/div[1]/div/a/div/div[1]/div/span/span")).click();
			
			//*[@type='submit' or @name='btnReset']
		}
		
	
	}
	
	// Step 3 To go to particular Window from the list generate a method
	
	public static boolean switchToWindow(String windowTitle, List<String> hList)
	{
		for(String e:hList)
		{
			String title= driver.switchTo().window(e).getTitle();
			
			if(title.contains(windowTitle))
			{
				System.out.println("Found the right window");
				return true;
			}
		}
		
		return false;
	}
	

	public static void main(String[] args)
	{
		
		AlertEx002 ex= new AlertEx002();
		
		ex.display();
		// TODO Auto-generated method stub

	}

}
