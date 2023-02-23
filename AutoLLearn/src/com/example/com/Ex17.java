package com.example.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex17 {
	public void display()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rashm\\OneDrive\\Documents\\Automation Learning\\CD\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.com/");
		driver.manage().window().maximize();
		
		WebElement categories = driver.findElement(By.linkText("Features"));
		categories.click();

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex17 testex17 = new Ex17();
		testex17.display();


	}

}
