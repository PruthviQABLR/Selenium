package com.example.com;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex15 {
	
	public void capture()
	{
		// Initialize webdriver and launch website
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rashm\\OneDrive\\Documents\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.com/");
		driver.manage().window().maximize();
		
		// Click on signup
		
		WebElement SignUp = driver.findElement(By.linkText("Sign Up"));
		SignUp.click();
		System.out.println("Sign Up link is clicked");
		
		// Navigating to the other window
		
		String WinHandleBefore = driver.getWindowHandle();
		for(String WinHandle:driver.getWindowHandles()) {
			driver.switchTo().window(WinHandle);
		}
		
		// Select Country dropdown 
		
		Select cntryDropdown = new Select(driver.findElement(By.name("country")));
		List<WebElement> dropdownValues = cntryDropdown.getOptions();
		int count = dropdownValues.size();
		System.out.println("The total number of countries listed in the dropdown values is :"+count);
		
		System.out.println("Please find the below list of countries:");
		
		// print the countries listed in the dropdown
		
		int index =0;
		for(WebElement x:dropdownValues)
		{
			System.out.println(x.getText());
			index++;
		}
		
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex15 testex15 = new Ex15();
		testex15.capture();
	}

}
