package com.example.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex11_RadChkBox {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rashm\\OneDrive\\Documents\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.com/");
		driver.manage().window().maximize();
		
		//WebElement login_btn = driver.findElement(By.linkText("login"));
		try
		{
		if(driver.findElement(By.linkText("login")).isDisplayed())
		{
			WebElement login_btn = driver.findElement(By.linkText("login"));
			System.out.println(login_btn.getAttribute("role"));
			System.out.println("The Login button exists in the application");
		}
		if(driver.findElement(By.linkText("login")).isDisplayed()==false)
		{
			
			System.out.println("The Login button does not exists in the application");
		}
		} catch (Exception e) {}
	}

}
