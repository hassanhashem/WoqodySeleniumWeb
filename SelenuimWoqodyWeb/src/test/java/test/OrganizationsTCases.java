package test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import Pages.DashboardPage;
import Pages.LoginPage;
import Pages.OrganizationsPage;
//start of test case
public class OrganizationsTCases 
{
	WebDriver driver = null;
	ExtentSparkReporter spark;
	ExtentReports extent;
	@SuppressWarnings("deprecation")
	@BeforeTest
	public void Login() throws InterruptedException 
	{
		//Reports
		spark = new ExtentSparkReporter("WoqodyExecutionReport.html");
		extent = new ExtentReports();
		extent.attachReporter(spark);
		//end of reports
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\SelenuimWoqodyWeb\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://staging-admin.woqody.tech/login");
		LoginPage.loginusername(driver).sendKeys("admin@woqody-staging.tech");
		LoginPage.loginpassword(driver).sendKeys("@P@2CK550OQylm");
		LoginPage.loginbutton(driver).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		OrganizationsPage.Organizationslink(driver).click();


	}	
	//Start SWitchlanguage test case
	@SuppressWarnings("deprecation")			
	@Test(priority = 1)
	public void Globalsearch() throws InterruptedException
	{
		//Reports
		ExtentTest test = extent.createTest("Globalsearch Test Results");
		test.log(Status.PASS, "Globalsearch");
		//end of reports
		//Start Test here...

	}
	//End of Test

	@AfterTest()
	public void teardown() 
	{
		//driver.close();
		extent.flush();
	}
}
