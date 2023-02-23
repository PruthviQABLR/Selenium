package com.example.com;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandleEx004 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rashm\\OneDrive\\Documents\\Automation Learning\\CD\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent window handle is "+parentWindow);
		
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		// Click on all the links FB/Twitter/Youtube/Linkedin
		
		WebElement tw = driver.findElement(By.xpath("//a[@href='https://twitter.com/orangehrm?lang=en']"));
		tw.click();
		
		WebElement FB = driver.findElement(By.xpath("//a[@href='https://www.facebook.com/OrangeHRM/']"));
		FB.click();
		
		WebElement YT = driver.findElement(By.xpath("//a[@href='https://www.youtube.com/c/OrangeHRMInc']"));
		YT.click();
		
		WebElement Ln = driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']"));
		Ln.click();
		
		Thread.sleep(5000);
		
		Set<String> winhandles = driver.getWindowHandles();
		
		System.out.println("Number of tabs open are :"+winhandles.size());
		
		for(String win:winhandles)
		{
			driver.switchTo().window(win);
			System.out.println(driver.getTitle());
			if(driver.getTitle().contains("Facebook"))
			{
				Thread.sleep(5000);
				driver.findElement(By.name("email")).sendKeys("Pruthvi");
				driver.findElement(By.name("pass")).sendKeys("Pruthvi");
				driver.findElement(By.xpath("//*[@id='login_form']/div[2]/div[3]/div/div/div[1]/div/span/span")).click();
			}
			
		}
		
		//switch to parent window
		driver.switchTo().window(parentWindow);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		driver.quit();
		System.out.println("We have done this program sucessfully");
		

	}

}
