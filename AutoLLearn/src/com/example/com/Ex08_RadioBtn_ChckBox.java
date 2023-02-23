package com.example.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex08_RadioBtn_ChckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rashm\\OneDrive\\Documents\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver  dr = new ChromeDriver();
		
		dr.get("http://demo.guru99.com/test/radio.html");
		dr.manage().window().maximize();
		
		WebElement rad1 = dr.findElement(By.xpath("//input[@name='webform' and @id = 'vfb-7-1']"));
		rad1.click();
		
		WebElement rad2 = dr.findElement(By.xpath("//input[@name='webform' and @id = 'vfb-7-2']"));
		rad2.click();
		
		WebElement rad3 = dr.findElement(By.xpath("//input[@name='webform' and @id = 'vfb-7-3']"));
		rad3.click();
		
		if (rad1.isSelected())
		{
			String a = rad1.getAttribute("value");
			System.out.println(a);
			
		} else if (rad2.isSelected())
		{
			String b = rad2.getAttribute("value");
			System.out.println(b);
		} else if (rad3.isSelected())
		{
			String c = rad3.getAttribute("value");
			System.out.println(c);
			
		}
		
		
		WebElement chbx = dr.findElement(By.xpath("//input[@name='webform' and @id = 'vfb-6-0']"));
		if(chbx.isSelected())
		{
			System.out.println("Check box is selected");
		}
		else 
		{
			System.out.println("Check box is Unselected");
		}
		
		WebElement chbx1 = dr.findElement(By.xpath("//input[@name='webform' and @id = 'vfb-6-1']"));
		chbx1.click();
		if(chbx1.isSelected())
		{
			System.out.println("Check box2 is selected");
		}
		else
		{
			System.out.println("Check box2 is unselected");
		}
		

	}

}
