package com.example.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.*;

public class Ex13_CobmboBox {
	
	public void selectCombo()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rashm\\OneDrive\\Documents\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		// dropdown web element selection
		
		Select dropdownCountry =new Select(driver.findElement(By.name("country")));
		dropdownCountry.selectByIndex(3);
		
		List<WebElement>ls = dropdownCountry.getOptions();
		int size = ls.size();
		int index = 0;
		System.out.println("the total count of values in the dropdown is "+size);
		for(WebElement x:ls)
		{
			System.out.println(x.getText());
			index++;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ex13_CobmboBox testComboBox =  new Ex13_CobmboBox();
		testComboBox.selectCombo();
		
		

	}

}
