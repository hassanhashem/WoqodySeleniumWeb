package WoqodyPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\Automation\\SelenuimWoqodyWeb\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://staging-admin.woqody.tech/login");
	driver.findElement(By.xpath("//*[@id=\"login_email\"]")).sendKeys("admin@woqody-staging.tech");
	driver.findElement(By.xpath("//*[@id=\"login_password\"]")).sendKeys("@P@2CK550OQylm");
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/form/div[3]/div/div/span/button")).click();
}	
	
	
}
