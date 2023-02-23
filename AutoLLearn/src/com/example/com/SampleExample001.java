package com.example.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleExample001 {
	
	public void display() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rashm\\OneDrive\\Documents\\Automation Learning\\CD\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		//Instant demo request form
		
		WebElement userFName = driver.findElement(By.name("first_name"));
		userFName.sendKeys("Rama");
		
		WebElement userLName = driver.findElement(By.name("last_name"));
		userLName.sendKeys("Ganesh");
		
		WebElement userBusinessName = driver.findElement(By.name("business_name"));
		userBusinessName.sendKeys("Rama_Ganesh_Automation_Tester");
		
		WebElement userEmail = driver.findElement(By.name("email"));
		userEmail.sendKeys("Rama_Ganesh@gmail.com");
		
		int val1 =Integer.parseInt(driver.findElement(By.xpath("//*[@id=\'numb1\']")).getText());
		
		int val2 = Integer.parseInt(driver.findElement(By.xpath("//*[@id=\'numb2\']")).getText());
		
		int val3 =val1+val2;
		
		WebElement result = driver.findElement(By.id("number"));
		result.sendKeys(String.valueOf(val3));
		
		Thread.sleep(2000);
		
		WebElement submitbtn = driver.findElement(By.id("demo"));
		submitbtn.click();
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		SampleExample001 testsample = new SampleExample001();
		testsample.display();

	}

}
