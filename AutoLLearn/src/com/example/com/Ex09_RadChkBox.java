package com.example.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ex09_RadChkBox {
	
	public void Validate()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rashm\\OneDrive\\Documents\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr =  new ChromeDriver();
		dr.get("https://demo.guru99.com/test/radio.html");
		dr.manage().window().maximize();
		
		// verify if all the radio buttons are disabled
		
		WebElement radiobtnA = dr.findElement(By.xpath("//input[@name='webform' and @id='vfb-7-1']"));
		WebElement radiobtnB = dr.findElement(By.xpath("//input[@name='webform' and @id='vfb-7-2']"));
		WebElement radiobtnC = dr.findElement(By.xpath("//input[@name='webform' and @id='vfb-7-3']"));
		
		if(radiobtnA.isSelected()==false)
		{
			System.out.println("First Radio button is not selected");
		}
		if(radiobtnB.isSelected()==false)
		{
			System.out.println("Second Radio button is not selected");
		}
		if(radiobtnC.isSelected()==false)
		{
			System.out.println("Third Radio button is not selected");
		}
		
		System.out.println("All the Radio buttons are not selected");
		
		WebDriverWait wait = new WebDriverWait(dr,Duration.ofSeconds(10));
		
		WebElement chboxA = dr.findElement(By.xpath("//input[@name='webform' and @id ='vfb-6-0']"));
		WebElement chboxB = dr.findElement(By.xpath("//input[@name='webform' and @id ='vfb-6-1']"));
		WebElement chboxC = dr.findElement(By.xpath("//input[@name='webform' and @id ='vfb-6-2']"));
		
		if(chboxA.isSelected()==false)
		{
			System.out.println("CheckBox A is not checked");
		}
		if(chboxB.isSelected()==false)
		{
			System.out.println("CheckBox B is not checked");
		}
		if(chboxC.isSelected()==false)
		{
			System.out.println("CheckBox C is not checked");
		}
		System.out.println("All the checkboxes are not checked");
		WebDriverWait waitA = new WebDriverWait(dr,Duration.ofSeconds(10));
		
		dr.close();
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ex09_RadChkBox  testRadChBox = new Ex09_RadChkBox();
		
		//verify if all the radio buttons and check boxes are not selected
		testRadChBox.Validate();

	}

}
