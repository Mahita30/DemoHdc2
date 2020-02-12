package hdc2demos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Alerts {
	@Test(enabled = false)
	public void f() {
		WebDriver driver;
		driver = WebUtility.getDriver("CRM");
		driver.get("https://www.tsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();

		if (ExpectedConditions.alertIsPresent() != null) {
			System.out.println("alerts are present");
			Alert alrt = driver.switchTo().alert();// for moving alert
			// alrt.getText()
			System.out.println(alrt.getText());// for fetching alert text
			alrt.accept();// for yes
//		alrt.dismiss();//for no

		} else {
			System.out.println("no alerts present for the launched application");
		}

	}
@Test
	private void framedemo() {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = WebUtility.getDriver("CRM");
		driver.get("https://www.w3schools.com/Js/tryit.asp?filename=tryjs_alert");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame(driver.findElement(By.name("iframeResult")));
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//driver.switchTo().defaultContent();//to come out of the frame

	}
}
