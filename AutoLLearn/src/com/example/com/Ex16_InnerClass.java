package com.example.com;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.*;
import java.util.*;

public class Ex16_InnerClass {
	
	class checkDropdown
	{
		public void selectdropdown()
		{
			// get user input for website
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter the URL:");
			String website = scan.nextLine();
			System.out.println("The Website you have entered is as below:");
			System.out.println(website);
			
			// Configure selenium webdriver
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rashm\\OneDrive\\Documents\\Automation Learning\\CD\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get(website);
			System.out.println(website+" Website is launched and its title of the page is "+driver.getTitle());
			driver.manage().window().maximize();
			
			// Clicking on sign up button
			
			WebElement signup = driver.findElement(By.linkText("Sign Up"));
			signup.click();
			
			// navigating to the new active window
			
			String WinHandleBefore = driver.getWindowHandle();
			for(String WinHandle:driver.getWindowHandles())
			{
				driver.switchTo().window(WinHandle);
			}
			
			// navigate to dropdown -country
			
			Select CountryDropDown = new Select(driver.findElement(By.name("country")));
			List<WebElement> lst = CountryDropDown.getOptions();
			
			for(WebElement i:lst)
			{
				System.out.println(i.getText());
			}
			System.out.println("The total countries listed in the dropdown is :"+lst.size());
			
			try
			{
				FileWriter fs = new FileWriter("C:\\Users\\rashm\\OneDrive\\Documents\\Automation Learning\\output\\valuesdropdown.txt");
				BufferedWriter out = new BufferedWriter(fs);
				out.write("There are "+lst.size()+" countries listed in the dropdown.");
				out.write("\n");
				for(WebElement i:lst)
				{
					out.write(i.getText());
					out.write("\n");
				}
				out.close();
			} catch (Exception e) {}
			}
					
		}

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex16_InnerClass testex16 = new Ex16_InnerClass();
		Ex16_InnerClass.checkDropdown testdropdown = testex16.new checkDropdown();
		testdropdown.selectdropdown();

	}

}
