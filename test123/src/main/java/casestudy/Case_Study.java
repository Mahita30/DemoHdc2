package casestudy;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Case_Study {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;

	@BeforeTest
	public void startReportBeforeTest() {
htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/Case_Study_Solution.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		// To add system or environment info by using the setSystemInfo method.
		htmlReporter.config().setDocumentTitle("Extent Report Demo case study");
		htmlReporter.config().setReportName("Test Report for Demo");
//      htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
	}

	@Test(priority = 1)
	public void testRegistration() throws InterruptedException {
		test = extent.createTest("TC_01", "Registration");
		driver = Utility.getDriver("CRM");
		driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm#");
		WebElement sp = driver.findElement(By.linkText("SignUp"));
		sp.click();
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("sweety");
		WebElement fn = driver.findElement(By.xpath("//input[@id='firstName']"));
		fn.click();
		Thread.sleep(3000);
		WebElement avail = driver.findElement(By.xpath("//*[@id=\"err\"]"));
		String Actualtext = avail.getText();
		System.out.println(Actualtext);
		String Expectedtext = "Available";
		System.out.println("we can happily proceed further as the user name is : " + Actualtext);
		Assert.assertEquals(Actualtext, Expectedtext);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("mahitha");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("sweety");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abcd123");
		driver.findElement(By.xpath("//*[@id=\"pass_confirmation\"]")).sendKeys("abcd123");
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[6]/div/div/label/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys("mahitha@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"mobileNumber\"]")).sendKeys("9865066477");
		driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys("01/29/1998");
		driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("Hyderabad");
		WebElement dn = driver.findElement(By.xpath("//select[@id='securityQuestion']"));
		Select sel = new Select(dn);
		sel.selectByValue("411013");
		driver.findElement(By.xpath("//*[@id=\"answer\"]")).sendKeys("mahi");
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
		driver.close();
	}

	@Test(priority = 2)
	public void testLogin() throws InterruptedException {
		test = extent.createTest("TC_02", "Login");
		driver = Utility.getDriver("CRM");
		driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm#");
//       Sri.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
		WebElement r = driver.findElement(By.linkText("SignIn"));
		r.click();
		WebElement a = driver.findElement(By.name("userName"));
		WebElement b = driver.findElement(By.id("password"));
		a.sendKeys("sweety");
		b.sendKeys("abcd123");
		WebElement c = driver.findElement(By.name("Login"));
		c.click();
		String act = driver.getTitle();
		String expect = "Home";
		Thread.sleep(5000);
		Assert.assertEquals(act, expect);
		// System.out.println("success");
	}

	@Test(priority = 3)
	public void testCart() throws InterruptedException {
		test = extent.createTest("TC_03", "TestMeCart");
		WebElement all = driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/a/span")); // all categories
		Actions act = new Actions(driver);
		act.moveToElement(all).build().perform();
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/ul/li[1]/a/span"));
		ele.click();
		Thread.sleep(2000);
		WebElement head = driver.findElement(By.xpath("//*[@id=\"submenuul11290\"]/li[1]/a/span"));
		head.click();
		WebElement add = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a"));
		add.click();
		WebElement cart = driver.findElement(By.xpath("//i[@class='fa fa-shopping-cart']"));
		cart.click();
		String actu = driver.getTitle();
		String expec = "View Cart";
		Assert.assertEquals(actu, expec);
//     System.out.println("success");
	}

	@Test(priority = 4)
	public void testPayment() throws InterruptedException {
		test = extent.createTest("TC_04", "TestPayment");

		WebElement checkout = driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a"));
		checkout.click();
		Thread.sleep(2000);
		WebElement pmethod = driver
				.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input"));
		pmethod.click();
		Thread.sleep(3000);

		WebElement hdfc = driver.findElement(By.xpath("//*[text()='HDFC Bank']"));
		hdfc.click();

		Thread.sleep(5000);
		WebElement con = driver.findElement(By.xpath("//*[@id=\"btn\"]"));
		con.click();
		WebElement user = driver
				.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[1]"));
		user.sendKeys("123457");
		WebElement pass = driver
				.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[2]"));
		pass.sendKeys("Pass@457");
		WebElement login = driver
				.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input"));
		login.click();
		WebElement tpass = driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input"));
		tpass.sendKeys("Trans@457");
		WebElement paynow = driver
				.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input"));
		paynow.click();
		WebElement oid = driver.findElement(By.xpath("/html/body/b/section/div/div/div/table[1]/thead/tr/th[1]"));
		String a_title = "Order Details";
		String e_title = driver.getTitle();
		Assert.assertEquals(a_title, e_title);
		// System.out.println("order Successfully Done!!!!!!");
	}

	@AfterMethod
	public void getResult(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " FAILED ", ExtentColor.PINK));
			TakesScreenshot snapshot = (TakesScreenshot) driver;
			File src = snapshot.getScreenshotAs(OutputType.FILE);
			String Path = System.getProperty("user.dir") + "/test-output/screens/" + result.getName() + ".png";
			// FileUtil.copyFile(src, new File(Path));
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

	@AfterTest
	public void tearDown() {
		// to write or update test information to reporter
		extent.flush();
	}

}
