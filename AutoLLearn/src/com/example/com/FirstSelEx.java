package com.example.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelEx
{
	
	public void display()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rashm\\OneDrive\\Documents\\Automation Learning\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.linkedin.com/");
	}

	public static void main(String[] args)
	{
		
		FirstSelEx ex= new FirstSelEx();
		
		ex.display();
		// TODO Auto-generated method stub

	}

}
