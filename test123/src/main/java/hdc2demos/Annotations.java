package hdc2demos;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
  @Test
  public void login() {
	  System.out.println("Some 3 lines of code for login");
  }
  @BeforeMethod
  public void launch() {
	  System.out.println("Some 20 lines of code for launching the application");
  }
  @Test
  public void register() {
	  System.out.println("Some 15 lines of code for registration");
  }
  @AfterMethod
  public void close() {
	  System.out.println("Some 23 lines of code for loggingout");
  }
  @BeforeClass
  public void clearBrowserCache() {
	  System.out.println("Some 25 lines of code for clearing browser");
  }
  @AfterClass
  public void deleteCookies() {
	  System.out.println("Some 30 lines of code for deleting cookies");
  }
  @BeforeTest
  public void browserConfig() {
	  System.out.println("Some 35 lines of code for browser config");
  }
  @AfterTest
  public void browserRollBack() {
	  System.out.println("Some 35 lines of code for browser Roll Back");
  }
}
