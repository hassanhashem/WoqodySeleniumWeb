package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.LoginPageObjects;
public class LoginTCdemo{
	
	private static WebDriver driver = null;
	
	
	public static void main(String[] args){
		Validlogin();
	}
	@BeforeTest
	public static void validloginsetup(){
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\SelenuimWoqodyWeb\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();	
		LoginPageObjects login = new LoginPageObjects(driver);
	}
		
	@Test
	public static void Validlogin() {
		driver.get("https://staging-admin.woqody.tech/login");
		login.setemail("admin@woqody-staging.tech");
		login.setpassword("@P@2CK550OQylm");
		login.Clickloginbutton();
		driver.close();
		}
	
}
	
	
	
	
	}
