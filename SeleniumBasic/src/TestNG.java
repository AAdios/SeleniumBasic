
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class TestNG {
	WebDriver driver; 
	
	
@BeforeTest
public void testA() throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\geckodriver.exe");
	 driver=new FirefoxDriver();
	 driver.manage().window().maximize();
	 Thread.sleep(10000);
	 driver.get("https://accounts.google.com/");
	 
}
@Test
public void loginTest() throws InterruptedException
{
	driver.findElement(By.id("identifierId")).sendKeys("varma096@gmail.com");
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/content/span")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[1]/div/form/content/section/div/content/div[1]/div/div[1]/div/div[1]/input")).sendKeys("adesh@4655");
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/content/span")).click();
	
}
@AfterTest
public void closeBrowser() throws InterruptedException
{Thread.sleep(30000);
	driver.close();
}


}
