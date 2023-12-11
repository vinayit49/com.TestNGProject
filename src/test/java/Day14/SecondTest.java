package Day14;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondTest {
	
	WebDriver driver;
	
	
	@Test(priority=10)
	void openApp()
	{     
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
	}
    @Test(priority=20)
	void login()
	{
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
	    driver.findElement(By.xpath("//div[@class='oxd-form-actions orangehrm-login-action']")).click();
		
	}
	
	
	@Test(priority=30)
	void close()
	{
		driver.close();
	
	}
	
	
}
