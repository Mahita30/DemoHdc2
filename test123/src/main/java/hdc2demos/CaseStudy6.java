package hdc2demos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CaseStudy6 {
  @Test(priority=4)
  public void testPaymet() {
	  WebDriver driver;
	  driver=WebUtility.getDriver("CRM");
	  driver.get("http://172.31.36.202:443/TestMeApp/displayCart.htm");
	  driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='btn btn-success btn-block']")).click();
		driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
  }
}
