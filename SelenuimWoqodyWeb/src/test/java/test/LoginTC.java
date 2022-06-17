package test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Pages.DashboardPage;
import Pages.LoginPage;
//-----------------------------------------------------------------------------------
//start of test case
public class LoginTC 
{
	WebDriver driver = null;
	ExtentSparkReporter spark;
	ExtentReports extent;
	
			@BeforeTest
			public void setupTest() 
				{
				//Reports
				spark = new ExtentSparkReporter("WoqodyExecutionReport.html");
				extent = new ExtentReports();
				extent.attachReporter(spark);
				//end of reports
				System.setProperty("webdriver.chrome.driver","D:\\Automation\\SelenuimWoqodyWeb\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				}	
			@Test
			public void Validlogin()
				{
					//Reports
					ExtentTest test = extent.createTest("Woqody Dashboard Test Results");
					test.pass("Pass");
					test.log(Status.PASS, "Login");
					//end of reports
					driver.manage().window().maximize();
					driver.get("https://staging-admin.woqody.tech/login");
					LoginPage.loginusername(driver).sendKeys("admin@woqody-staging.tech");
					LoginPage.loginpassword(driver).sendKeys("@P@2CK550OQylm");
					LoginPage.loginbutton(driver).click();
					
				}
			//End of test case
			
			
			
			
			
			
			
			
			//---------------------------------------------------------------------------------------
			@AfterTest()
								
			public void teardown() 
			{
				extent.flush();				
			}
			

}
