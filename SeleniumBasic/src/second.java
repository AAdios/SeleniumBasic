import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class second {
	WebDriver driver;
	
	
	public  void invokeBrowser()
	{
		
		try {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\geckodriver.exe");
			 driver = new FirefoxDriver();
			driver.manage().window().maximize();
			performAction();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void  performAction()
	{
		try {
			
			driver.get("https:/www.amazon.com");
			Thread.sleep(10000);
			driver.findElement(By.linkText("Your Amazon.com")).click();
			driver.navigate().back();
			Thread.sleep(10000);
			driver.findElement(By.linkText(	"Today's Deals")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div/div[6]/a/span")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[1]/div/div[2]/div[1]/a/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("varma096@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("adesh@4655");
			driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void closeBrowser()
	{
		System.out.println("closing the broser");
	}
	public static void main(String[] args) {
		
		
		System.out.print("hi from main method ");
		second s=new second();
		s.invokeBrowser();

	}

}
