package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrganizationsPage 
{
	private static WebElement element = null;
	//------------------------------------------------------------------------------------------------
	
	public static WebElement  Organizationslink (WebDriver driver ) 

	{
		element = driver.findElement(By.xpath("//body/div[@id='root']/section[1]/section[1]/aside[1]/div[1]/div[1]/ul[1]/li[2]/span[1]/a[1]"));
		return element;		
	}

	
}
