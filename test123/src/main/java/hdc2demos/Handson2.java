package hdc2demos;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Handson2 {
	@Test
	public void f() throws InterruptedException {
		WebDriver driver;
		driver = WebUtility.getDriver("CRM");
		driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement sb = driver.findElement(By.xpath("//span[text()='AboutUs']"));
		Actions act = new Actions(driver);
		act.moveToElement(sb).build().perform();
		Thread.sleep(3000);
		WebElement sb1 = driver.findElement(By.xpath("//li[@class='subfirst']"));
		act.moveToElement(sb1).build().perform();
		WebElement sb2 = driver.findElement(By.xpath("//span[text()='Bangalore']"));
		sb2.click();
		
		Set<String> T_windows=driver.getWindowHandles();
		for(String S:T_windows)
		{
			driver.switchTo().window(S);
			String Itr_id=driver.getWindowHandle();
			
		}
		driver.switchTo().frame(driver.findElement(By.xpath("/html/frameset/frame[2]"))) ;
		WebElement s=driver.findElement(By.xpath("//*[@id=\"demo3\"]"));
		String t=s.getText();
		System.out.println(t);

	}
}
