package hdc2demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver a;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe\\");
		a=new ChromeDriver();
		a.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
		a.manage().window().maximize();
		a.findElement(By.linkText("SignUp")).click();
		WebElement app=a.findElement(By.xpath("//select[@id='securityQuestion']"));
		Select sel=new Select(app);
		sel.selectByValue("411012");
		
		

	}

}
