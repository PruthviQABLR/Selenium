package com.example.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocatorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\rashm\\OneDrive\\Documents\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();		
		String weburl = "https://www.facebook.com";
		dr.get(weburl);
		dr.manage().window().maximize();
		
		//using ID
		WebElement userID = dr.findElement(By.id("email"));
		userID.sendKeys("Pruthvishankar@aol.com");
		userID.clear();
		
		//using Name
		WebElement userName = dr.findElement(By.name("email"));
		userName.sendKeys("PruthviShankar@aol.com");
		userName.clear();
		
		// using Xpath 
		
		WebElement userXpath = dr.findElement(By.xpath("//*[@id='email']"));
		userXpath.sendKeys("PruthviShankar@aol.com");
		userXpath.clear();

		// using class Name
		
		WebElement userClassName = dr.findElement(By.ByClassName.className("inputtext _55r1 _6luy"));
		userClassName.sendKeys("PruthviShankar@aol.com");
		userClassName.clear();
		
		// using Link Text
		WebElement frgtPw = dr.findElement(By.linkText("Forgotten password?"));
		frgtPw.getAttribute(weburl);
		frgtPw.click();
		System.out.println("We have clicked the link successfully");
		
		dr.close();
		
				
		
		
		

	}

}
