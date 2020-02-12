package hdc2demos;

import org.testng.annotations.Test;

public class TestNgDemo1 {
  @Test(priority=2,invocationCount=5)
  public void registeration() {
	  System.out.println("code for register");
  }
  @Test(priority=2,enabled=false)
  public void login() {
	  System.out.println("code for login");
  }
  @Test(priority=3,enabled=false)
  public void logout() {
	  System.out.println("code for logout");
  }
}
