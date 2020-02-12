package hdc2demos;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Asserts {
  @Test(enabled=false)
  public void hardassert() {
	  int a=10;
	  int b=20;
	  int c=10;
	  Assert.assertEquals(a, c);//true
	  System.out.println("comparison done for the first time");
	  Assert.assertEquals(a,b);//false
	  System.out.println("comparison done for the second time");
	  
	  
  }

@Test
public void softassert() {
	  int a=10;
	  int b=20;
	  int c=10;
	  SoftAssert sa1=new SoftAssert();
	sa1.assertEquals(a, c);//true
	  System.out.println("comparison done for the first time");
	  sa1.assertEquals(a,b);//false
	  System.out.println("comparison done for the second time");
	  
}
}
