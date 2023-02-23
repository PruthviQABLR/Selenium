package com.example.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex02 {
	
	public void display()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rashm\\OneDrive\\Documents\\Automation Learning\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		String url = "https://www.youtube.com/";
		dr.get(url);
		System.out.println(dr.getTitle());
		dr.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ex02 testex02 = new Ex02();
		testex02.display();

	}

}
