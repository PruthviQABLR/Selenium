package com.example.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rashm\\OneDrive\\Documents\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.facebook.com");
		
		//WebElement inputUserID = dr.findElement(By.xpath("//*[@id='email']"));
	    //inputUserID.sendKeys("XYZ@apple.com");
		
		//WebElement inputUserID = dr.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
		//inputUserID.sendKeys("absouluteXpath");
		
		//WebElement inputUserID = dr.findElement(By.xpath("//input[@name='email']"));
		//inputUserID.sendKeys("RestinPeace");
		
		//WebElement inputUserID = dr.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
		//inputUserID.sendKeys("Lakshika");
		
		WebElement inputUserID = dr.findElement(By.xpath("//input[@data-testid='royal_email']"));
		inputUserID.sendKeys("comman@email.com");
		
		
				
				
		

	}

}
