package Day34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondTest {
	
	WebDriver driver;
	//@BeforeClass
	@Test(priority=1)
	void openApp()
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		
		
	}
	
	
	
	
	@Test(priority=2)
	void login()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		
	driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		
		
	}
	//@AfterClass
	@Test(priority=3)
	void close()
	{
		
		
		driver.quit();
		
	}
	

}
