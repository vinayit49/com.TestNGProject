package Day34;

import org.testng.annotations.Test;

public class NewTest {
  @Test(priority=1)
  public void test1() {
	  
	  System.out.println("Testing1");
	  
  }
  
  @Test(priority=2)
  public void test2() {
	  
	  System.out.println("Testing2");
	  
  }
  @Test(priority=3)
  public void test3() {
	  
	  
	  System.out.println("Testing3");
	  
	  
  }
}
