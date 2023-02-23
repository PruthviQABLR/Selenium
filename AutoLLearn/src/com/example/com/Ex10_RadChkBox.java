package com.example.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ex10_RadChkBox {
	
	public void verify()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rashm\\OneDrive\\Documents\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://demo.guru99.com/test/radio.html");
		dr.manage().window().maximize();
		
		WebElement radbtn = dr.findElement(By.xpath("//input[@name='webform' and @id='vfb-7-2']"));
		WebElement chkbox = dr.findElement(By.xpath("//input[@name='webform' and @id='vfb-6-2']"));
		
		if(radbtn.isSelected()!=true)
		{ 
			radbtn.click();
			String a = radbtn.getAttribute("value");
			System.out.println(a+" radiobutton is checked now");
			
		}
		else
		{
			System.out.println("There are no radio button in the page ");
		}
		
		if(chkbox.isSelected()!=true)
		{
			chkbox.click();
			String b = chkbox.getAttribute("value");
			System.out.println(b+" check box is now selected");
		}
		else 
		{
			System.out.println("There are no Checkbox in the page ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ex10_RadChkBox testRadChkBox = new Ex10_RadChkBox();
		testRadChkBox.verify();

	}

}
