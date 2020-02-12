package hdc2demos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExcelDemo {
  @Test
  public void f() throws Exception {
	  WebDriver driver;
	  File myf1=new File("C:\\Users\\H2_9_19_User10\\Desktop\\selenium.xlsx\\");
	  FileInputStream fis=new FileInputStream(myf1);
	  XSSFWorkbook wb=new   XSSFWorkbook(fis);
	  XSSFSheet sh=wb.getSheetAt(0);
	 int rows= sh.getLastRowNum();
	 for(int i=1;i<=rows;i++)
	 {
		String uname= sh.getRow(i).getCell(0).getStringCellValue();
		String pass= sh.getRow(i).getCell(1).getStringCellValue();
		System.out.println("username this time is:" +uname);
		System.out.println("Password this time is:" +pass);
//		String A_txt=driver.findElement(By.xpath("")).getTitle();
//		String E_text="Home";
//		Assert.assertEquals(A_txt,E_txt);
		sh.getRow(i).createCell(2).setCellValue("Login success");
		FileOutputStream fos= new FileOutputStream(new File("C:\\\\Users\\\\H2_9_19_User10\\\\Desktop\\\\selenium.xlsx\\\\"));
		 wb.write(fos);
		  
	 }
	 wb.close();
	 
	  
  }
}
