package project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
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
  public void pageTitleTest() {
	  //Get the page title and verify it
	  assertEquals(driver.getTitle(), "Alchemy Jobs – Job Board Application");
	  
  }
  
  
  @AfterClass
  public void tearDown() {
      // Close the browser
      driver.quit();
  }
  
}



