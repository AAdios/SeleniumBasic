

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class first {

	WebDriver driver; 
		public  void involeBrowser()
		{
			try {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\geckodriver.exe");
				 driver = new FirefoxDriver();
				driver.manage().window().maximize();
				performAction();
			} catch (Exception e) {
				e.printStackTrace();
			}
			//*[@id="u_0_r"]
		}
		public void performAction()
		{
			try {
				Thread.sleep(20000);
				driver.get("https://www.facebook.com/");
				driver.findElement(By.xpath("//*[@id=\"u_0_j\"]")).sendKeys("Rahul");
				driver.findElement(By.xpath("//*[@id=\"u_0_l\"]")).sendKeys("Maurya");
				driver.findElement(By.xpath("//*[@id=\"u_0_o\"]")).sendKeys("okma096@gmail.com");
				driver.findElement(By.xpath("//*[@id=\"u_0_r\"]")).sendKeys("okma096@gmail.com");
				driver.findElement(By.xpath("//*[@id=\"u_0_v\"]")).sendKeys("rahul@4655");
				driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/form/div[1]/div[6]/div[2]/span/span/select[1]/option[22]")).click();
				driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/form/div[1]/div[6]/div[2]/span/span/select[2]/option[13]")).click();
				driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/form/div[1]/div[6]/div[2]/span/span/select[3]/option[26]")).click();
				WebElement radioBtn = driver.findElement(By.xpath("//*[@id=\"u_0_a\"]"));
				radioBtn.click();
				
				driver.findElement(By.xpath("//*[@id=\"u_0_11\"]")).click();
				
				/*driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("varma096@gmail.com");
				driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("adesh@4655");
				driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();*/
				//driver.close();
					
		} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	public static void main(String[] args)  {
		first d=new first();
		d.involeBrowser();

		
	}
}
