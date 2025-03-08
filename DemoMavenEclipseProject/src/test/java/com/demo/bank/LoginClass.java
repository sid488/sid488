package com.demo.bank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginClass {
	 	
	public static void main(String[] args) {
		 WebDriver driver;
		 String browserType = "chrome";
		 
		driver = utilities.DriverFactory.openBrowser(browserType);
		driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).sendKeys("Rahul488");
        driver.findElement(By.name("password")).sendKeys("9553364064A");
        //driver.findElement(By.xpath("//input[@fdprocessedid = 'ngocic']")).click();
        //driver.findElement(By.xpath("//input[text() = 'Log In']")).click();
        driver.findElement(By.cssSelector("input[value = 'Log In']")).click();
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        String expectedTitle = "ParaBank | Welcome | Online Banking";
        if(actualTitle.equals(expectedTitle)) {
        	System.out.println("Title Test is Pass");
        }
        else {
        	System.out.println("Title Test is Fail");
        }
	
        driver.close();
}
}