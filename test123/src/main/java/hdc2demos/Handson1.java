package hdc2demos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Handson1 {
	@Test
	public void f() throws Exception {
		WebDriver driver;
		driver = WebUtility.getDriver("CRM");
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement sb = driver.findElement(By.xpath("//input[@id=\"small-searchterms\"]"));
		Actions act = new Actions(driver);
		act.keyDown(sb, Keys.SHIFT).sendKeys("computer").keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(4000);
		act.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
	}
}
