package webTesting001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpForm {
	
	WebDriver driver;
	
	
	public SignUpForm(WebDriver driver) {
		super();
		this.driver = driver;
	}

	By fName = By.name("firstname");
	By lName= By.name("lastname");
	By email = By.name("email");
	By phoneNumber = By.name("phonenumber");
	By countrycode = By.xpath("//div[@data-dial-code='91']");
	By companyName = By.name("companyname");
	By addressLine1 = By.name("address1");
	By addressLine2 = By.name("address2");
	By city = By.name("city");
	By state = By.name("state");
	By postcode = By.name("postcode");
	By country = By.id("inputCountry");
	By mobileNumber = By.name("customfield[2]");
	By password = By.name("password");
	By passwordreEnter = By.name("password2");
	By checkbox = By.xpath("//div[@class='recaptcha-checkbox goog-inline-block recaptcha-checkbox-unchecked rc-anchor-checkbox']");
	By registerbtn = By.xpath("//*[@id=\'frmCheckout\']/p/input");
	
	
	public void firstname(String FirstName)
	{
		driver.findElement(fName).sendKeys(FirstName);
	}
	
	public void lastname(String LastName)
	{
		driver.findElement(lName).sendKeys(LastName);
	}
	
	public void email(String Email)
	{
		driver.findElement(email).sendKeys(Email);
	}
	
	public void countryCode()
	{
		Select countryCode = new Select(driver.findElement(countrycode));
		countryCode.selectByValue("91");		
	} 
	
	public void phonenumber(String PhoneNumber)
	{
		driver.findElement(phoneNumber).sendKeys(PhoneNumber);
	}
	
	public void companyname(String CompanyName)
	{
		driver.findElement(companyName).sendKeys(CompanyName);
	}
	
	public void addressA(String AddressLine1)
	{
		driver.findElement(addressLine1).sendKeys(AddressLine1);
	}
	
	public void addressB(String AddressLine2)
	{
		driver.findElement(addressLine2).sendKeys(AddressLine2);
	}
	
	public void city(String City)
	{
		driver.findElement(city).sendKeys(City);
	}
	
	public void state(String State)
	{
		driver.findElement(state).sendKeys(State);
	}
	
	public void postcode(String PostalCode)
	{
		driver.findElement(postcode).sendKeys(PostalCode);
	}
	
	public void country(String Country)
	{
		Select userCountry = new Select(driver.findElement(country));
		userCountry.selectByValue(Country);
	} 
	
	public void mobilenumber(String MobileNo)
	{
		driver.findElement(mobileNumber).sendKeys(MobileNo);
	}
	
	public void passwordA(String PasswordA)
	{
		driver.findElement(password).sendKeys(PasswordA);
		driver.findElement(passwordreEnter).sendKeys(PasswordA);
	}
	
	public void checkbox()
	{
		driver.findElement(checkbox).click();
	}
	
	public void register()
	{
		driver.findElement(registerbtn).click();
	}
	
	}
