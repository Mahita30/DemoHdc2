package casestudy;

import org.testng.annotations.Test;
import org.testng.asserts.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import static org.testng.Assert.assertEquals;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class Class1 {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;

	@Test(dataProvider = "dp", priority = 1)

	public void registration(String un, String fn, String ln, String ps, String cp, String email, String num,
			String dob, String addr, String ans) throws InterruptedException {
		test = extent.createTest("TC_01", "Registration verification");

		driver = Utility.getDriver("CRM");
		driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(un);
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).click();
		Thread.sleep(3000);
		WebElement e = driver.findElement(By.xpath("//*[@id=\"err\"]"));
//	     SoftAssert sa1=new SoftAssert();
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
		return new Object[][] { new Object[] { "ikki69", "dikki", "gund", "abc456", "abc456", "mahit@abc.com",
				"9908032002", "30/06/1997", "karimnagar", "dog" }, };
	}

	@Test(priority = 2)

	public void testLogin() {
		test = extent.createTest("TC_02", "Login verification");
		WebDriver driver;
		driver = Utility.getDriver("CRM");
		driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("ikki69");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abc456");
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
		WebElement sig = driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a"));
		String a_txt = sig.getText();
		String e_txt = "SignOut";
		Assert.assertEquals(a_txt, e_txt);
		System.out.println("login done");
	}

	@Test(priority = 3)

	public void testCart() throws InterruptedException {
		test = extent.createTest("TC_03", "Cart Addition verification");
		WebDriver driver;
		driver = Utility.getDriver("CRM");
		driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("ikki69");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abc456");
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
		Actions act1 = new Actions(driver);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/a/span")).click();
//	Actions act1=new Actions(driver);
//		act1.moveToElement(cli).build().perform();
		driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/ul/li[1]/a/span")).click();
//	act1.moveToElement(cli2).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Head Phone']")).click();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		// Thread.sleep(3000);
		WebElement cli3 = driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]"));
		String s1 = cli3.getText();
		String s2 = "Cart 1   ";
		Assert.assertEquals(s1, s2);
		System.out.println("adding done");

	}

	@Test(priority = 4)
	public void testPayment() throws InterruptedException {
		test = extent.createTest("TC_04", "payement verification");
		WebDriver driver;
		driver = Utility.getDriver("CRM");
		driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("ikki69");
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
		Thread.sleep(2000);
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

	@AfterMethod
	public void getResultAfterMethod(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " FAILED ", ExtentColor.PINK));

			TakesScreenshot snapshot = (TakesScreenshot) driver;
			File src = snapshot.getScreenshotAs(OutputType.FILE);
			String Path = System.getProperty("user.dir") + "/test-output/screens/" + result.getName() + ".png";
			FileUtils.copyFile(src, new File(Path));
			test.addScreenCaptureFromPath(Path, result.getName());
			test.fail(result.getThrowable());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " PASSED ", ExtentColor.INDIGO));
		} else {
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " SKIPPED ", ExtentColor.ORANGE));
			test.skip(result.getThrowable());
		}
	}

	@BeforeTest
//   public void startReport(String OS, String browser) {
	public void startReportBeforeTest() {
		// initialize the HtmlReporter
		htmlReporter = new ExtentHtmlReporter(
				System.getProperty("user.dir") + "/test-output/testReport_CasetudySol.html");

		// initialize ExtentReports and attach the HtmlReporter
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		// To add system or environment info by using the setSystemInfo method.
//       extent.setSystemInfo("OS", OS);
//       extent.setSystemInfo("Browser", browser);
//       
		// configuration items to change the look and feel
		// add content, manage tests etc
//       htmlReporter.config().setChartVisibilityOnOpen(true);
		htmlReporter.config().setDocumentTitle("Extent Report for case study");
		htmlReporter.config().setReportName("Test Report for Demo");
//       htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
	}

	@AfterTest
	public void endReportAfterTest() {
		// to write or update test information to reporter
		extent.flush(); // to publish the final report
	}
}
