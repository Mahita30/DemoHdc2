package hdc2demos;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import com.beust.jcommander.Parameters;

public class ParameterGrouping {
	@Parameters({"tester","location"})
  @Test
  public void primemembership(String tester,String location) {
	  System.out.println("code for membership");
	  System.out.println("it's executed by:" +tester);
	  System.out.println("it's executed by:" +location);
  }
  @Test
  public void renewal() {
	  System.out.println("code for renewal");
  }
  @Parameters({"tester","location"})
  @Test
  public void terminantion(String tester,String location) {
	  System.out.println("code for termination");
	  System.out.println("it's executed by:" +tester);
	  System.out.println("it's executed by:" +location);
  }
}
