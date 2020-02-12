package hdc2demos;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class TestNg1 {
	@Test(dataProvider = "credentials")
	  
	  public void login(String name,String password) {
		  WebDriver driver;
		  System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe\\");
		  driver=new ChromeDriver();
		  System.out.println("username this time is:"+name);
		  System.out.println("password this time is:"+password);
		  driver.findElement(By.xpath("")).sendKeys(name);//uname
		  driver.findElement(By.xpath("")).sendKeys(password);//paswd
	  }

	  @DataProvider
	  public Object[][] credentials(){
	    return new Object[][] {
	      new Object[] { "lalitha", "passwoerd123" },
	      new Object[] { "mahita", "ballu" },
	    };
  }
}
