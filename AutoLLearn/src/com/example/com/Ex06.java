package com.example.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rashm\\OneDrive\\Documents\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr =  new ChromeDriver();
		
		dr.get("https://www.way2automation.com/way2auto_jquery/index.php");
		System.out.println("We have launched the page successfully");
		System.out.println(dr.getTitle());

		// Enter Name
		WebElement nameFld = dr.findElement(By.xpath("//input[@name='name' and @type='text']"));
		nameFld.sendKeys("Paramashiva");
		System.out.println("We have printed the name successfully");
		dr.getTitle();
				
		

	}

}
