package hdc2demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SmartTours {
	public static void main(String[] args) {
		WebDriver a;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe\\");
		a=new ChromeDriver();
		a.get("https://smartours.com/new-tours/");
		a.manage().window().maximize();
		//a.findElement(By.xpath("//span[@text()='Perfect Tour']")).click();
		WebElement b = a.findElement(By.xpath("(//span[text()='destination'])[1]"));
		Select s=new Select(b);
		s.selectByVisibleText("Asia");
		/*WebElement c = a.findElement(By.xpath("//span[text()='select date']"));
		WebElement d = a.findElement(By.xpath("//span[text()='price']"));
		b.sendKeys("Asia");
		c.sendKeys("fall '20");
		d.sendKeys("$5000");
		a.findElement(By.name("search")).click();*/
	}

}
