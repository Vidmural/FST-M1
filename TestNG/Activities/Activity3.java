package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
	//Declare webdriver
	WebDriver driver;
	
	//Set up method
	@BeforeClass
	  public void setUp() {
		   {
		        // Initialize webdriver
		        driver = new FirefoxDriver();
		        //Open the page
		        driver.get("https://training-support.net/webelements/login-form");
		  }
	  }
	
	
  @Test(priority = 1)
    public void loginFormTest() {
	  //Find the user name field and type in the username
	  driver.findElement(By.id("username")).sendKeys("admin");
	  //Find the password field and type in the password
	  driver.findElement(By.id("password")).sendKeys("password");
	  //Find the submit button and click it
	  driver.findElement(By.xpath("//button[text()='Submit']")).click();
	  
	//Verify the login message
	  String message = driver.findElement(By.tagName("h2")).getText();
	  assertEquals(message, "Welcome Back, Admin!");
  }

  @AfterClass
  public void tearDown() {
      // Close the browser
      driver.quit();
  }
  
}



