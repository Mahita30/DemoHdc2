package hdc2demos;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NooflinksDemo {
	public static void main(String[] args) throws Exception {
		WebDriver ab;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe\\");
		ab=new ChromeDriver();
		ab.get("https://demowebshop.tricentis.com/");
		ab.manage().window().maximize(); 
		ab.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//This is applicable to every subsequent line of code on this program
		//And this is going to work like exist of UFT i.e whenever it is required then only it will consume
		//the complete given time but by any chance if the webElement present in a lesser time it will continue moving further without making much delay
		//Thread.sleep(50000);
		WebDriverWait wait1=new WebDriverWait(ab,60);//it waits for 60 seconds
		wait1.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath((""))));
		List<WebElement> t_links=ab.findElements(By.tagName("a"));
		int n_links=t_links.size();
		System.out.println(n_links);
		for(int i=0;i<n_links;i++)
		{
			String l_linkname=t_links.get(i).getText();
			System.out.println("The " +i +"th link is:"+l_linkname);
		}
		
	}

}
