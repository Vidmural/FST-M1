package project;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
	//Declare webdriver
	WebDriver driver;
	
	//Set up method
	@BeforeClass
	  public void setUp() {
		   {
		        // Initialize webdriver
		        driver = new FirefoxDriver();
		        //Open the page
		        driver.get("https://alchemy.hguy.co/jobs");
		  }
	  }
	
	
  @Test(priority = 1)
  public void pageHeadingTest() {
	  
	  String subHeading = driver.findElement(By.className("entry-title")).getText();
      Assert.assertTrue(subHeading.contains("Welcome to Alchemy Jobs"));
	  
  }
  
  
  @AfterClass
  public void tearDown() {
      // Close the browser
      driver.quit();
  }
  
}
