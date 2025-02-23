package project;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
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
  public void jobsPageTest() {
	  driver.findElement(By.id("menu-item-24")).click();
	  String jobsheading = driver.findElement(By.id("menu-item-24")).getText();
	  System.out.println("Page Title " + jobsheading);
	  System.out.println("Page Title " + driver.getTitle());
      assertEquals(driver.getTitle(), "Jobs – Alchemy Jobs");
	  
  }
  
  
  @AfterClass
  public void tearDown() {
      // Close the browser
      driver.quit();
  }
  
}
