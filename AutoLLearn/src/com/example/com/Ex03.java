package com.example.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex03 {
	
	public void display_details()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rashm\\OneDrive\\Documents\\Automation Learning\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://www.thetesttribe.com/");
		System.out.println(wd.getTitle());
		System.out.println(wd.getCurrentUrl());
		wd.close();
		System.out.println("We have successfully launched and closed the webpage.");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ex03 testex03 = new Ex03();
		testex03.display_details();
		
		

	}

}
