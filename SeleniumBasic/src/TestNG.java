
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class TestNG {
	WebDriver driver; 
	
	
@Test
public void testA() throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\geckodriver.exe");
	 driver=new FirefoxDriver();
	 driver.manage().window().maximize();
	 Thread.sleep(20000);
	 driver.get("https://www.google.com/");
	 
}


}
