package hdc2demos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Acc {
  @Test()//enabled=false
  public void f() throws Exception {
	  WebDriver driver;
	  driver=WebUtility.getDriver("CRM");
	  driver.get("http://www.google.com");
	  WebElement sb=driver.findElement(By.name("q"));
	//sb.sendKeys("accenture");
	Actions act=new Actions(driver);
//	act.keyDown(sb,Keys.SHIFT).sendKeys("accenture").keyUp(Keys.SHIFT).build().perform();
	act.sendKeys("accenture").keyDown(sb,Keys.ALT).keyUp(Keys.ALT).build().perform();
	Thread.sleep(5000);
	act.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).build().perform();
	act.sendKeys(Keys.ENTER).build().perform();
  }
}
