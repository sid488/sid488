package maven.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginUserNew {
   	//maven.testng.loginUserNew
     WebDriver driver;
     String browserType = "chrome";
     
  @Test
  public void titleTest() {
      String actualTitle = driver.getTitle();
      System.out.println(actualTitle);
      String expectedTitle = "ParaBank | Welcome | Online Banking";
      if(actualTitle.equals(expectedTitle)) {
      	System.out.println("Login successfull with valid title");
      }
      else {
      	System.out.println("Login successfull with invalid title");
      }
		}
  @BeforeClass
	public void lauchBrowser() {
	driver = utilities.DriverFactory.openBrowser(browserType);
	driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
    driver.manage().window().maximize();
    driver.findElement(By.name("username")).sendKeys("Rahul488");
    driver.findElement(By.name("password")).sendKeys("9553364064A");
  //driver.findElement(By.xpath("//input[@fdprocessedid = 'ngocic']")).click();
  //driver.findElement(By.xpath("//input[text() = 'Log In']")).click();
    driver.findElement(By.cssSelector("input[value = 'Log In']")).click();
	}
	@AfterClass
	public void closeBroswer() {
    driver.close();
}
}
