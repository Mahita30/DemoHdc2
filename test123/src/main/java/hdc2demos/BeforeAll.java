package hdc2demos;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BeforeAll {
	WebDriver driver;
	  @Parameters({"tester","location","browser"})
	  @Test
	  public void primemembership(String tester,String location,String browser) {
		  driver=WebUtility.getDriver(browser);
		  System.out.println("code for membership");
		  System.out.println("it's executed by:" +tester);
		  System.out.println("it's executed by:" +location);
		  System.out.println("it's executed by:" +browser);
	  }
	  @BeforeTest
	  public void browserConfig() {
		  System.out.println("Some 35 lines of code for browser config");
	  }
	  @AfterTest
	  public void browserRollBack() {
		  System.out.println("Some 101 lines of code for browser Roll Back");
	  }
	  @BeforeSuite
	  public void connectiveData() {
		  System.out.println("Some 90 lines of code for connective database");
	  }
	  @AfterSuite
	  public void connectionless() {
		  System.out.println("Some 44 lines of code for connection lost");
	  }
	 
	  
  }

