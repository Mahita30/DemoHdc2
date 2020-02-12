package hdc2demos;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestNG3 {
  @Test
  public void f() {
	  WebDriver driver;
	  driver=WebUtility.getDriver("CRM");
	  driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
  }
}
