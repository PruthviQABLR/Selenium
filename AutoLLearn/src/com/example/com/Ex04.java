package com.example.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rashm\\OneDrive\\Documents\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.facebook.com");
		dr.manage().window().maximize();
		

		WebElement userid = dr.findElement(By.id("email"));
		userid.sendKeys("put your ID");
		WebElement pw = dr.findElement(By.id("pass"));
		pw.sendKeys("put your pw");
		
		WebDriverWait wait =new WebDriverWait(dr, Duration.ofSeconds(60));
		WebElement lgin = wait.until(ExpectedConditions.elementToBeClickable(By.name("login")));
		lgin.click();
		System.out.println(dr.getTitle());
		dr.close();
		
		

	}

}
