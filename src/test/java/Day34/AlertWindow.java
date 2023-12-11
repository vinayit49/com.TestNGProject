package Day34;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertWindow {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/users/sign_up");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='user_full_name']")).sendKeys("vinay");
		driver.findElement(By.xpath("//input[@id='user_email_login']")).sendKeys("vinayit49@gmail.com");
		driver.findElement(By.id("user_password")).sendKeys("vinay@123");
		driver.findElement(By.id("tnc_checkbox")).click();
		driver.findElement(By.xpath("//input[@id='user_submit']")).click();
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		String alertMessage= driver.switchTo().alert().getText();
		
		
	//driver.findElement(By.id("accept-cookie-notification")).click();
	}

}
