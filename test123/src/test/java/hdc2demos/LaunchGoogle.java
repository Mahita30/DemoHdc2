package hdc2demos;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

//import java.awt.Dimension;//

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGoogle {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver Mahita;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe\\");
         Mahita=new ChromeDriver();
         Mahita.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");//launch
       /* // Mahita.navigate().to("http://www.google.com");//launch
         Mahita.manage().window().maximize();
         
         Dimension d=new Dimension(300,600);
         Mahita.manage().window().setSize(d);
         Thread.sleep(3000);//to set the horizon(coordinates)
         
         Point p=new Point(300,700);
         Mahita.manage().window().setPosition(p);
         Thread.sleep(3000);//to change the horizon(coordinates)
         
         String E_title="Google";
         String A_title=Mahita.getTitle();
         if(A_title.equals(E_title))
         {
        	 System.out.println("page opened");
         }
         else
         {
        	 System.out.println("page not opened");
         }
         Mahita.close();//closes the most recent active window accessed by the webD
         river
         //Mahita.quit();//closes all the windows that are accessed by the webDriver*/
	/*WebElement un=Mahita.findElement(By.name("email"));
	WebElement ps=Mahita.findElement(By.id("pass"));
	WebElement bu=Mahita.findElement(By.id("u_0_c"));
	
	
	un.sendKeys("nikita");
	ps.sendKeys("mahi123");
	bu.click();*/
        Mahita.findElement(By.linkText("SignIn")).click();
         WebElement un=Mahita.findElement(By.name("userName"));
     	WebElement ps=Mahita.findElement(By.name("password"));
    	WebElement bu=Mahita.findElement(By.name("Login"));

    	un.sendKeys("lalitha");
    	ps.sendKeys("password123");
    	bu.click();
         
	}
	

}
