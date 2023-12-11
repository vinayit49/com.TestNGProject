package Day14;

import org.testng.annotations.Test;

public class FirstTest {
	
	@Test(priority=1)
	void openApp()
	{
		System.out.println("openapp");
	}
	@Test(priority=2)
	void Login()
	{
		System.out.println("login page");
	}
	@Test(priority=3)
	void Logout()
	{
		System.out.println("logout page");
	}
}
