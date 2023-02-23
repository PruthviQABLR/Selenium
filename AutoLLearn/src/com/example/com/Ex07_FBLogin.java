package com.example.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex07_FBLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rashm\\OneDrive\\Documents\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://phptravels.com/demo/");
		driver.manage().window().maximize();
		
		//Clicking on sign up functionality
		
		WebElement signUpForm = driver.findElement(By.linkText("Sign Up"));
		signUpForm.click();
		
		// get the current title 
		
		System.out.println(driver.getTitle());
		
		// switch window
		
		String winHandleBefore = driver.getWindowHandle();
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
		
		// Enter personal details
		
		WebElement fName = driver.findElement(By.xpath("//input[@name='firstname' and @id='inputFirstName']"));
		fName.sendKeys("Robert");
		
		WebElement lName = driver.findElement(By.xpath("//input[@name='lastname' and @id = 'inputLastName']"));
		lName.sendKeys("Solenki");
		
		WebElement Email = driver.findElement(By.xpath("//input[@name='email' and @id = 'inputEmail']"));
		Email.sendKeys("Robert.Solenki@gmail.com");
		
		WebElement telPhone = driver.findElement(By.xpath("//input[@name='phonenumber' and @id ='inputPhone']"));
		telPhone.sendKeys("9900023700");	
		
		// Enter Billing address
		
		WebElement compName = driver.findElement(By.xpath("//input[@name='companyname' or @id='inputCompanyName']"));
		compName.sendKeys("Comat Technologies");
		
		WebElement add1 =  driver.findElement(By.xpath("//input[@name='address1' and @id = 'inputAddress1']"));
		add1.sendKeys("dr number 2, 23 cross,5the main");
		
		WebElement add2 = driver.findElement(By.xpath("//input[@name='address2' and @id = 'inputAddress2']"));
		add2.sendKeys("Tyagaraja Nagar");
		
		WebElement city = driver.findElement(By.xpath("//input[@name='city' and @id='inputCity']"));
		city.sendKeys("Chitradurga");
		
		WebElement state = driver.findElement(By.xpath("//input[@name='state' and @id ='stateinput']"));
		state.sendKeys("Karnataka");
		
		WebElement Pcode = driver.findElement(By.xpath("//input[@name='postcode' and @id ='inputPostcode']"));
		Pcode.sendKeys("560061");
		
		// Selecting dropdown value
		
		Select dropdown = new Select(driver.findElement(By.id("inputCountry")));
		dropdown.selectByVisibleText("India");
		
		//Additional required information
		
		WebElement mbnum = driver.findElement(By.xpath("//input[@name='customfield[2]' and @id='customfield2')"));
		mbnum.sendKeys("8862568984");
		
		// Account Security
		
		WebElement pw = driver.findElement(By.xpath("//input[@name='password' and @id='inputNewPassword1')]"));
		pw.sendKeys("Testing@123");
		
		WebElement repw = driver.findElement(By.xpath("//input[@name='password2' and @id = 'inputNewPassword2']"));
		pw.sendKeys("Testing@123");
		
		WebElement chbox = driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor-label\"]"));
		chbox.click();
		
		//Click on Register button
		
		WebElement rgbtn = driver.findElement(By.xpath("//input[@type='submit' and @value='Register']"));
		rgbtn.click();
		
		System.out.println("Successfully submitted the form");
		
		
		
		
		
		

	}

}
