package hdc2demos;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class TestNg2 {
	@Test(dataProvider = "details")
	  public void login( String username,String password) {
		  WebDriver driver;
		  System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe\\");
		  driver=new ChromeDriver();
		  driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
		  System.out.println("username this time is:"+username);
		  System.out.println("password this time is:"+password);
		  driver.findElement(By.linkText("SignIn")).click();
		  driver.findElement(By.xpath(" //input[@id='userName']")).sendKeys(username);//username
		  driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);//password
		  driver.findElement(By.xpath("//input[@name='Login']")).click();
		  String e_title="Home";
		  String a_title=driver.getTitle();
		/*if(e_title.equals(a_title))
		{
			System.out.println("hello");
		}
		else
			
		{
			System.out.println("hi");
		}*/
		  Assert.assertEquals(a_title, e_title);
	  }
		   


	  @DataProvider
	  public Object[][] details() {
	    return new Object[][] {
	      new Object[] { "lalitha", "password123" },
	      new Object[] { "mahita", "password456" },
	      new Object[] {"swagatika","password789"},
    };
  }
}
