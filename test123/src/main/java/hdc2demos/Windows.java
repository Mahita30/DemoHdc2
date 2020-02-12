package hdc2demos;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Windows {
  @Test
  public void f() throws Exception {
	  WebDriver driver;
		driver = WebUtility.getDriver("CRM");
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		driver.manage().window().maximize();
		String P_id=driver.getWindowHandle();//to fetch unique id
		System.out.println("Parent window id is:" +P_id);
		driver.findElement(By.xpath("//*[@id=\"homeLoanButton\"]/a/img")).click();//parent page
		Thread.sleep(2000);
//		 pagedriver.findElement(By.xpath("//*[@id=\"mainMenu\"]/ul/li[8]/a")).click();//child
		String C_id=driver.getWindowHandle();
	System.out.println("Parent window id is:" +C_id);	
		//driver.switchTo().window
//		driver.close();
//		driver.quit();
	Set<String> T_windows=driver.getWindowHandles();
	for(String S:T_windows)
	{
		driver.switchTo().window(S);
		String Itr_id=driver.getWindowHandle();
		System.out.println("the window ithis time is:" + Itr_id);
	}
		driver.findElement(By.xpath("//*[@id=\"mainMenu\"]/ul/li[8]/a")).click();//child
	driver.switchTo().window(P_id);
		
	  
  }
}
