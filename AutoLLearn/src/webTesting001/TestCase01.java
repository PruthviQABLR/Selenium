package webTesting001;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import webTesting001.SignUp;
import webTesting001.SignUpForm;

public class TestCase01 {
	
	static WebDriver driver;
	
	public void launchBrowser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rashm\\OneDrive\\Documents\\Automation Learning\\CD\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TestCase01 test = new TestCase01();
		try
		{
			test.launchBrowser();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		
		Thread.sleep(3000);
		
		SignUp signuptest = new SignUp(driver);
		SignUpForm signupformtest =  new SignUpForm(driver);
		signuptest.signup();
		Thread.sleep(2000);
		
		String parentWindow = driver.getWindowHandle();
		Set<String> winhandles= driver.getWindowHandles();
		
		for(String win:winhandles)
		{
			driver.switchTo().window(win);
			if(driver.getTitle().contains("Register - PHPTRAVELS"))
			{
				Thread.sleep(3000);
				signupformtest.firstname("Jack");
				signupformtest.lastname("Mathew");
				signupformtest.email("Jack.Mathew@gmail.com");
				signupformtest.countryCode();
				signupformtest.phonenumber("9900023499");
				signupformtest.companyname("Comat");
				signupformtest.addressA("Banashankari");
				signupformtest.addressB("Ittamadu");
				signupformtest.city("Bangalore");
				signupformtest.state("Karnataka");
				signupformtest.postcode("560085");
				//signupformtest.country("IN");
				signupformtest.mobilenumber("99833928392");
				signupformtest.passwordA("Testing@123");
				JavascriptExecutor jws =  (JavascriptExecutor) driver;
				jws.executeScript("window.scrollBy(0,document.body.scrollHeight)");
				Thread.sleep(3000);
				signupformtest.checkbox();
				signupformtest.register();
				Thread.sleep(5000);
				driver.quit();
			}
		}

	}

}
