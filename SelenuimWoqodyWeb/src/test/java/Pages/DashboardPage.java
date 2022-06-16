package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage 
{
	private static WebElement element = null;
	//------------------------------------------------------------------------------------------------
	public static WebElement  Globalsearch (WebDriver driver ) 
	{
		element = driver.findElement(By.xpath("//div[2]//button[1]//span[2]"));
		return element;		
	}	
	
	public static WebElement homepageheader (WebDriver driver ) 
	{
		element = driver.findElement(By.xpath("//*[@id=\"root\"]/section/header"));
		return element;		
	}
	//----------------------------------------------------------------------------------------------------------
}
