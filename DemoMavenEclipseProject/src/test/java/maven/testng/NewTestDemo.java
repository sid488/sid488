package maven.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTestDemo {
  @Test
  public void f() {
	  System.out.println("actualtest");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("precondition");
  }
 
  @AfterClass
  public void afterClass() {
	  System.out.println("postcondition");
  }

}
