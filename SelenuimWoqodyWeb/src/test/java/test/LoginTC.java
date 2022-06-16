package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.LoginPage;
//-----------------------------------------------------------------------------------
//start of test case
public class LoginTC 
{
	private static WebDriver driver = null;
	public static void main(String[] args)
		{
			System.setProperty("webdriver.chrome.driver","D:\\Automation\\SelenuimWoqodyWeb\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://staging-admin.woqody.tech/login");
			LoginPage.loginusername(driver).sendKeys("admin@woqody-staging.tech");
			LoginPage.loginpassword(driver).sendKeys("@P@2CK550OQylm");
			LoginPage.loginbutton(driver).click();
		}	
//end of test case
}
