package Day14;

import org.testng.annotations.Test;

public class ThirdTestCase {
	
	@Test(priority=1)
	void test1()
	{
		System.out.println("openapp");
	}
	@Test(priority=2)
	void test2()
	{
		System.out.println("login page");
	}
	@Test(priority=3)
	void test3()
	{
		System.out.println("logout page");
	}
}



