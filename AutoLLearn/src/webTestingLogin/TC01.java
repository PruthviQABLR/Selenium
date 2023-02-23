package webTestingLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import webTestingLogin.LoginEx;

public class TC01 {
	
	static WebDriver driver;
	
	public void display() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rashm\\OneDrive\\Documents\\Automation Learning\\CD\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	    
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TC01 testtc01 = new TC01();
		try {
			testtc01.display();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		LoginEx lgntest = new LoginEx(driver);
		Thread.sleep(4000);
		lgntest.firstname("Pruthvi");
		lgntest.lastname("Shankar");
		lgntest.businessname("Bharani");
		lgntest.email("PruthviQABLR5@gmail.com");
		lgntest.getValues();
		Thread.sleep(4000);
		lgntest.submit();
		Thread.sleep(10000);
		
		// close the browser
		
		String msg =driver.findElement(By.xpath("//*[@id=\'content\']/section[1]/div/div/div[2]/div/div/div/div/div/div/div/div[3]/p")).getText();
        System.out.println("Message displayes is as below:");
        System.out.println(msg);
        driver.quit();
	}

}
