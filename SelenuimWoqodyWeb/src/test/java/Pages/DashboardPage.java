package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage 
{
	private static WebElement element = null;
	//------------------------------------------------------------------------------------------------
	public static WebElement  swlanguage (WebDriver driver ) 
	
	{
		element = driver.findElement(By.xpath("//span[contains(text(),'العربية')]"));
		return element;		
	}




}
