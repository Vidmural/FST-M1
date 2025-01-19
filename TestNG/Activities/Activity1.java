package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
	//Declare webdriver
	WebDriver driver;
	
	//Set up method
	@BeforeClass
	  public void setUp() {
		        //Initialize webdriver
		        driver = new FirefoxDriver();
		        //Open the page
		        driver.get("https://training-support.net");
		  
	  }
		
  @Test(priority = 1)
  public void pageTitleTest() {
	  //Get the page title and verify it
	  assertEquals(driver.getTitle(), "Training Support");
	  
  }
  
  @Test(priority = 2)
  public void aboutUsLinkTest() {
	  driver.findElement(By.linkText("About Us")).click();
	  
	//Verify the new page title
	  assertEquals(driver.getTitle(), "About Training Support");
  }

  @AfterClass
  public void tearDown() {
      // Close the browser
      driver.quit();
  }
  
}



