package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//----------------------------------------Add Objects locators-----------------------------------------------------
public class LoginPageObjects 
	{
			WebDriver driver = null;					
			By email = By.xpath("//*[@id=\"login_email\"]");
			By password= By.xpath("//*[@id=\"login_password\"]")  ;
			By loginbutton = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/form/div[3]/div/div/span/button");
public LoginPageObjects (WebDriver driver)
	{
	this.driver = driver;
	}
//------------------------------------------------------------------------------------------------------------------
public void setemail(String text) 
	{
			driver.findElement(email).sendKeys(text);
	
	}
public void setpassword(String text) 
	{
			driver.findElement(password).sendKeys(text);

	}
public void Clickloginbutton() 
	{
			driver.findElement(loginbutton).sendKeys(Keys.RETURN);

	}

}
	

