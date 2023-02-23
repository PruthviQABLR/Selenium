package com.example.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex12 {
	
	String website ;
	
	public Ex12(String website) {
		super();
		this.website = website;
	}
		public void load()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rashm\\OneDrive\\Documents\\New folder\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get(website);
			driver.manage().window().maximize();	
			System.out.println(driver.getTitle()+" Page is loaded successfully");
			driver.close();
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
