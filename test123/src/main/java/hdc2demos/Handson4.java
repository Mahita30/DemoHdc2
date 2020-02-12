package hdc2demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Handson4 {
  @Test
  public void follow() throws Exception {
	  WebDriver driver;
	  driver=WebUtility.getDriver("CRM");
	  driver.get("https://www.naukri.com/");
	  Thread.sleep(2000);
	  WebElement w1=driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[1]/div"));
	  Actions act2=new Actions(driver);
	  act2.doubleClick(w1).build().perform();
	  String txtval=w1.getText();
	  System.out.println(txtval);
	  
  }
}
