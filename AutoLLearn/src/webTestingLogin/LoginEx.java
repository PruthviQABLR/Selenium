package webTestingLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginEx {
	
	WebDriver driver;
	

	public LoginEx(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	// Create locators
	
	By fName = By.name("first_name");
	By lName = By.name("last_name");
	By bName = By.name("business_name");
	By uEmail = By.name("email");
	By btnSubmit = By.id("demo");
	By val1 =  By.xpath("//*[@id='numb1']");
	By val2 = By.xpath("//*[@id='numb2']");
	By result = By.id("number");
	
	public void firstname(String FirstName)
	{
		driver.findElement(fName).sendKeys(FirstName);
	}
	
	public void lastname(String LastName)
	{
		driver.findElement(lName).sendKeys(LastName);
	}
	public void businessname(String BusinessName)
	{
		driver.findElement(bName).sendKeys(BusinessName);
	}
	public void email(String Email)
	{
		driver.findElement(uEmail).sendKeys(Email);
	}
	public void getValues()
	{
		int v1 = Integer.parseInt(driver.findElement(val1).getText());
		int v2 = Integer.parseInt(driver.findElement(val2).getText());
		int sum = v1 + v2;
		driver.findElement(result).sendKeys(String.valueOf(sum));
	}
	public void submit()
	{
		driver.findElement(btnSubmit).click();
	}


}
