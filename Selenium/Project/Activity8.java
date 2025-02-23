package project;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity8 {
	//Declare webdriver
	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//Set up method
	@BeforeClass
	  public void setUp() {
		   {
		        // Initialize webdriver
		        driver = new FirefoxDriver();
		        //Open the page
		        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
		  }
	  }
	
	
  @Test(priority = 1)
  public void jobsPageTest() {
	  
	  driver.findElement(By.id("user_login")).sendKeys("root");
      driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
      driver.findElement(By.id("wp-submit")).click();
	  System.out.println("Page Title " + driver.getTitle());
      assertEquals(driver.getTitle(), "Dashboard ‹ Alchemy Jobs — WordPress");
     
  
  }
  
   
  @AfterClass
  public void tearDown() {
      // Close the browser
      driver.quit();
  }
  
}
