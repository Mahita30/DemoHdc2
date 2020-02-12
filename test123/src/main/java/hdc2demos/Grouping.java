package hdc2demos;

import org.testng.annotations.Test;

public class Grouping {
  @Test( priority =1 , groups= {"sanity","regression"})
  public void login() {
	  System.out.println("Code for login");
  }
  @Test(priority=2,groups= {"regression"})
  public void registration() {
	  System.out.println("Code for register");
  }
  @Test(groups= {"smoke"})
  public void logout() {
	  System.out.println("Code for logout");
  }
}
