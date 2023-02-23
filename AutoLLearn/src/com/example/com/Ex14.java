package com.example.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.*;

public class Ex14 {

	public void display()
	
	{
		System.out.println("Please enter the website URL: ");
		Scanner scan = new Scanner(System.in);
		String website= scan.nextLine();
		System.out.println("URL you have entered is : ");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rashm\\OneDrive\\Documents\\Automation Learning\\CD\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(website);
		driver.manage().window().maximize();
		
		WebElement signup = driver.findElement(By.linkText("Sign Up"));
		signup.click();
		
		//Switching window
		
		String WinHandleBefore = driver.getWindowHandle();
		for(String WinHandle:driver.getWindowHandles()) {
			driver.switchTo().window(WinHandle);
		}
		
		// Identify the dropdown
		
		Select dp = new Select(driver.findElement(By.name("country")));
		List<WebElement> dp_lst = dp.getOptions();
		
		int count = dp_lst.size();
		int index =0;
		System.out.println("The total number of countries listed are "+count);
		System.out.println("The Country names from the dropdown are listed as below ");
		
		for(WebElement x:dp_lst)
		{
			System.out.println(x.getText());
			index++;
		}			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex14 testEx14 = new Ex14();
		testEx14.display();

	}

}
