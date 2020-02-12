package hdc2demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		WebDriver b;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe\\");
		b = new ChromeDriver();
		b.navigate().to("http://www.facebook.com");
		WebElement un = b.findElement(By.id("u_0_m"));
		WebElement un1 = b.findElement(By.name("lastname"));
		WebElement un2 = b.findElement(By.id("u_0_r"));
		WebElement un3 = b.findElement(By.name("reg_passwd__"));
		WebElement un4 = b.findElement(By.name("birthday_day"));
		WebElement un5 = b.findElement(By.id("month"));
		WebElement un6 = b.findElement(By.id("year"));
		un.sendKeys("Mahita");
		un1.sendKeys("Gundeti");
		un2.sendKeys("8978640818");
		un3.sendKeys("Mahita123");
		un4.sendKeys("30");
		un5.sendKeys("Jun");
		un6.sendKeys("1997");
		b.findElement(By.xpath("//label[text()='Female']")).click();
		b.findElement(By.name("websubmit")).click();

	}

}
