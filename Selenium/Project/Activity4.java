package project;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity4 {
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
	  //Get the page subheading and verify it

	  String secondHeaderText = driver.findElement(By.xpath("//h2[contains(text(), 'Quia')]")).getText();
	  System.out.println(secondHeaderText);
	  assertEquals(secondHeaderText,"Quia quis non");
	  
  }
  
  
  @AfterClass
  public void tearDown() {
      // Close the browser
      driver.quit();
  }
  
}
