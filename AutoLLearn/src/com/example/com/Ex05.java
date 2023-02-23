package com.example.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ex05 {
	
	String weburl;	
	
	public Ex05(String weburl) {
		super();
		this.weburl = weburl;
	}

	class LoginFB {
		String UserID;
		String Pw;
		
		
		
		public LoginFB(String userID, String pw) {
			super();
			UserID = userID;
			Pw = pw;
		}



		public void Authenticate()
		{
			System.setProperty("Webdriver.chrome.driver","C:\\Users\\rashm\\OneDrive\\Documents\\New folder\\chromedriver_win32\\chromedriver.exe");
			WebDriver dr = new ChromeDriver();
			dr.get(weburl);
			dr.manage().window().maximize();
			
			WebElement id_txt = dr.findElement(By.id("email"));
			id_txt.sendKeys(UserID);
			
			WebElement pw_txt = dr.findElement(By.id("pass"));
			pw_txt.sendKeys(Pw);
			
			WebDriverWait wait = new WebDriverWait(dr,Duration.ofSeconds(20));
			WebElement lgn_btn =wait.until(ExpectedConditions.elementToBeClickable(By.name("login")));
			lgn_btn.click();
			
			dr.getTitle();
			System.out.println("We have successfully logged in");
			dr.close();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ex05 testEx05 = new Ex05("https://www.facebook.com");
		Ex05.LoginFB test_lgn = testEx05.new LoginFB("put your id","put your password");
		test_lgn.Authenticate();
		

	}

}
