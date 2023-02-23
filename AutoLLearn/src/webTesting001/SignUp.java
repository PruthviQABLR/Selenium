package webTesting001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUp {
	
	WebDriver driver;
	
	
	public SignUp(WebDriver driver) {
		super();
		this.driver = driver;
	}


	By SignUpbtn  = By.xpath("//*[@id=\'loginSignup\']/li[2]/a");
	
	public void signup()
	{
		driver.findElement(SignUpbtn).click();
	}
	

}
