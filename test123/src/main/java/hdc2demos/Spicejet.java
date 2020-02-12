package hdc2demos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Spicejet {
  @Test(enabled=false)
  public void hover() throws Exception {
	  WebDriver driver;
	  driver=WebUtility.getDriver("CRM");
	  driver.get("https://spicejet.com/default.aspx");
	  WebElement sb=driver.findElement(By.xpath("//a[@id='highlight-addons']"));
	  Actions act=new Actions(driver);
	  act.moveToElement(sb).build().perform();
	  Thread.sleep(5000);
	 driver.findElement(By.xpath("//a[text()='MyFlexiPlan']")).click();
  }
  
  
  @Test(enabled=false)
public void rightclick() throws Exception
{
WebDriver driver;
driver=WebUtility.getDriver("CRM");
driver.get("https:www.google.com");
Thread.sleep(2000);
WebElement sb1=driver.findElement(By.xpath("//a[text()='Gmail']"));
Actions act1=new Actions(driver);
act1.contextClick(sb1).build().perform();


}
  @Test(enabled=false)
public void doubleclick() throws Exception
{
WebDriver driver;
driver=WebUtility.getDriver("CRM");
driver.get("http://demowebshop.tricentis.com/");
Thread.sleep(2000);
WebElement sb2=driver.findElement(By.xpath("//span[text()='Sign up for our newsletter:']"));
Actions act2=new Actions(driver);
act2.doubleClick(sb2).build().perform();
String txtval=sb2.getText();
System.out.println(txtval);
}

@Test
public void dnd() throws Exception
{
	WebDriver driver;
	driver=WebUtility.getDriver("CRM");
	driver.get("http://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
//	Thread.sleep(2000);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebElement src=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadTreeView1\"]/ul/li/ul/li[3]/ul/li[1]/div/div/span"));
	WebElement dest=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadGrid1_ctl00__0\"]/td[1]"));
	Actions acts=new Actions(driver);
	acts.dragAndDrop(src,dest).build().perform();
	//for verification of dnd
	WebElement s1=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadGrid1_ctl00__0\"]/td[1]"));
//	Thread.sleep(2000);
	String A_val=s1.getText();
	System.out.println(A_val);
	String E_val="$0";
	Assert.assertNotSame(A_val,E_val);
	System.out.println("Drag and drop is successful");
	
}
}


