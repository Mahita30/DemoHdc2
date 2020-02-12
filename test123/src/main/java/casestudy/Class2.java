package casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Class2 {
	WebDriver driver;

	@Test(dataProvider = "dp", priority = 1)
	public void registration(String un, String fn, String ln, String ps, String cp, String email, String num,
			String dob, String addr, String ans) throws InterruptedException {

		driver = Utility.getDriver("CRM");
		driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(un);
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).click();
		Thread.sleep(3000);
		WebElement e = driver.findElement(By.xpath("//*[@id=\"err\"]"));
//	  SoftAssert sa1=new SoftAssert();
		String aval = e.getText();
		System.out.println(aval);
		String eval = "Available";
		Assert.assertEquals(eval, aval);
		if (aval.equals(eval)) {
			System.out.println(" we can happily proceed further as the user name is : " + eval);
			driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(fn);
			driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(ln);
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(ps);
			driver.findElement(By.xpath("//*[@id=\"pass_confirmation\"]")).sendKeys(cp);
			driver.findElement(By.xpath("//*[@id=\"gender\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys(email);
			driver.findElement(By.xpath("//*[@id=\"mobileNumber\"]")).sendKeys(num);
			driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys(dob);
			driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys(addr);
			WebElement s = driver.findElement(By.xpath("//*[@id=\"securityQuestion\"]"));
			Actions act = new Actions(driver);
			act.keyDown(s, Keys.ALT).keyUp(Keys.ALT).build().perform();
			act.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).build().perform();
			act.sendKeys(Keys.ENTER).build().perform();
			driver.findElement(By.xpath("//*[@id=\"answer\"]")).sendKeys(ans);
			driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
		} else {
			System.out.println(" we can't proceed further as : " + aval);
		}
		driver.close();

	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { "nikki6", "dikki", "gund", "abc456", "abc456", "mahit@abc.com",
				"9908032002", "30/06/1997", "karimnagar", "dog" }, };
	}

	@Test(priority = 2)

	public void testLogin() {
		WebDriver driver;
		driver = Utility.getDriver("CRM");
		driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("nikki6");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abc456");
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
		WebElement sig = driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a"));
		String a_txt = sig.getText();
		String e_txt = "SignOut";
		Assert.assertEquals(a_txt, e_txt);
		System.out.println("login done");
	}

	@Test(priority = 3)

	public void testCart() throws InterruptedException

	{
  WebDriver driver;
	driver=Utility.getDriver("CRM");
	driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click(); 
	driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("nikki6");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abc456");
	driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
		Thread.sleep(2000);
		Actions act1 = new Actions(driver);
		WebElement cli = driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/a/span"));
//	Actions act1=new Actions(driver);
		act1.moveToElement(cli).build().perform();
		driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/ul/li[1]/a/span")).click();
//	act1.moveToElement(cli2).build().perform();
		driver.findElement(By.xpath("//span[text()='Head Phone']")).click();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		//Thread.sleep(3000);
		WebElement cli3 = driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]"));
		String s1 = cli3.getText();
		String s2 = "Cart 1   ";
		Assert.assertEquals(s1, s2);
		System.out.println("adding done");

	}

	@Test(priority = 4)
	public void testPayment() throws Exception

	{
		WebDriver driver;
		driver = Utility.getDriver("CRM");
		driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("nikki6");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abc456");
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
		WebElement cli = driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/a/span"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(cli).build().perform();
		driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/ul/li[1]/a/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Head Phone']")).click();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
		driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
		Thread.sleep(3000);
		String mah = driver.getTitle();
		System.out.println(mah);
		driver.findElement(By.xpath("//*[@id=\"swit\"]/div[1]/div/label/i")).click();
		driver.findElement(By.xpath("//*[@id=\"btn\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[1]"))
				.sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[2]"))
				.sendKeys("Pass@456");
		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input"))
				.sendKeys("Trans@456");
		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();
		WebElement tt = driver.findElement(By.xpath("/html/body/b/section/div/div/div/div[2]/p"));
		String s6 = tt.getText();
		String s7 = "Your order has been confirmed";
		Assert.assertEquals(s6, s7);
		System.out.println("order done");

	}
}
