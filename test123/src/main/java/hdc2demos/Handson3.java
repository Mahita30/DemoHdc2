package hdc2demos;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Handson3 {
  @Test(dataProvider = "credentials")
  public void f(String Gender,String  Firstname,String  lastname,String  Email,String  password,String confirmpassword) {
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe\\");
	  driver=new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com/");
	System.out.println("Gender is:" +Gender );
	System.out.println("Fisrts name is:"+Firstname);
	System.out.println("last name is:"+lastname);
	System.out.println("email:"+Email);
	 System.out.println("password is:"+password);
	 System.out.println("password  this time is:"+confirmpassword);
	 
	 driver.findElement(By.xpath("//a[text()='Register']")).click();
	  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[1]/div[2]/label")).click();
	  driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(Firstname);
	  driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(lastname);
	  driver.findElement(By.xpath("//input[@name='Email']")).sendKeys(Email);
	  driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(password);
	  driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys(confirmpassword);
	  driver.findElement(By.xpath("//input[@name='register-button']")).click();
	
  }

  @DataProvider
  public Object[][] credentials() {
    return new Object[][] {
      new Object[] {"Female","Mahita","Gundeti","mahita.97@gmail.com","abc123","abc123" },
//      new Object[] { 2, "b" },
    };
  }
}
