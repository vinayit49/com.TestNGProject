package Day34;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	
	
	@BeforeMethod
	void Login()
	{
		System.out.println("Logining....");
	}
	@Test(priority=1)
	void search()
	{
		System.out.println("Search....");
	}
    
	@Test(priority=2)
	void advancesearch()
	{
		System.out.println("Advanced Search....");
		
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("Logout....");
	}
}   




