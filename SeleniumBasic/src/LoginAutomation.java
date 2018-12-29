import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginAutomation {
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	}
	@Test
	public void Login() throws InterruptedException
	{driver.navigate().to("https://www.ultimateqa.com/automation/");
	Thread.sleep(5000);
	WebElement loginform=driver.findElement(By.linkText("Login automation"));
	loginform.click();
	Thread.sleep(5000);
	driver.findElement(By.name("user[email]")).sendKeys("varma096@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.name("user[password]")).sendKeys("adesh@4655");
	WebElement checkbox=driver.findElement(By.id("user_remember_me"));
	checkbox.click();
	driver.findElement(By.name("commit")).click();
Thread.sleep(3000);
	boolean isDispalyed=driver.findElement(By.className("notifications-error__list-item")).isDisplayed();
System.out.println("Invalid user ID password:-"+isDispalyed);
		
	}
	
	
}
