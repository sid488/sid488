package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {

	 public static WebDriver openBrowser(String browserType) {
		 if(browserType.equalsIgnoreCase("chrome")) {
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Siddh\\softwares\\chromedriver.exe");
			 return new ChromeDriver();
		 }
		 else if(browserType.equalsIgnoreCase("firefox")) {
			 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Siddh\\softwares\\geckodriver.exe");
			 return new FirefoxDriver(); 
		 }
		 else {
			 System.setProperty("webdriver.ie.driver", "C:\\Users\\Siddh\\softwares\\IEDriverServer.exe");
			 return new InternetExplorerDriver(); 
		 }
	 }
}
