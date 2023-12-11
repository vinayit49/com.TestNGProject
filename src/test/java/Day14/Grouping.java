package Day14;

import org.testng.annotations.Test;

public class Grouping {
	@Test(priority=1,groups={"sanity","regression"})
	void loginByEmail()
	{
		System.out.println("Login by email");
		
	}
	@Test(priority=0,groups={"sanity"})
     void LoginByFacebook()
     {
    	 System.out.println("Login by facebook");
     }
	@Test(priority=3,groups={"regression"})
     void LoginBytwitter()
     {
    	 System.out.println("Login by twitter");
     }
	@Test(priority=4,groups={"sanity","regression"})
     void checkedinrupee()
     {
    	 System.out.println("checked in rupee");
     }
	@Test(priority=5,groups={"sanity"})
     void checkedindollar()
     {
    	 System.out.println("checked in dollar");
     }
	@Test(priority=6,groups={"regression"})
     void returninBank()
     {
    	 System.out.println("Return in Bank");
     }
     
     
     
     
     
}
