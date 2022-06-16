package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.LoginPage;
//-----------------------------------------------------------------------------------
//start of test case
public class LoginTC 
{
	WebDriver driver = null;
			@BeforeTest
			public void setupTest() 
				{
				System.setProperty("webdriver.chrome.driver","D:\\Automation\\SelenuimWoqodyWeb\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				}	
			@Test
			public void login()
				{
					driver.get("https://staging-admin.woqody.tech/login");
					LoginPage.loginusername(driver).sendKeys("admin@woqody-staging.tech");
					LoginPage.loginpassword(driver).sendKeys("@P@2CK550OQylm");
					LoginPage.loginbutton(driver).click();
				}	
//end of test case
}
