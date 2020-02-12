package hdc2demos;

import org.testng.annotations.Test;

public class DependsMethods {//code for skipping in the result
  @Test(dependsOnMethods="m1")
  public void flipkart() {
	  System.out.println("code for login of the flipkart");
  }
  @Test
  public void m1() {
	  int a=10;
	  int b=0;
	  int c=a/b;
	  System.out.println("the final value is:" +c);
  }
  @Test(priority=1)
  public void flipkartReg() {
	  System.out.println("code for registration of the flipkart");
  }
  
}
