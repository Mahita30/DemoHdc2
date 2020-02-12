package casestudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Utility {
	public static WebDriver getDriver(String b)
	{
		if(b.equals("CRM"))
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe\\");
			return new ChromeDriver();
		}
		else if(b.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\IEDriverServer.exe\\");
			return new InternetExplorerDriver();
		}
		else if(b.equals("FF"))
		{
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\geckodriver.exe\\");
			return new FirefoxDriver();
		}
		else
		{
			return null;
		}
	}

}
