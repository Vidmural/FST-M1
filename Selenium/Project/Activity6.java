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

public class Activity6 {
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
      
      driver.findElement(By.id("search_keywords")).sendKeys("Banking");
      driver.findElement(By.className("search_submit")).click();
      
     // wait.until(ExpectedConditions.elementToBeClickable(By.tagName("H3")));
   //   driver.findElement(By.className(contains(text,"IBM"))).click();
      driver.findElement(By.tagName("H3")).click();
      System.out.println("Page Title " + driver.getTitle());
  //    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='job_application application']")));
      driver.findElement(By.xpath("//div/input[@class='application_button button']")).click();
      String getEmailId = driver.findElement(By.xpath("//div/p/a[@class='job_application_email']")).getText();
      System.out.println("Email ID " + getEmailId);
   
  }
  
    
  @AfterClass
  public void tearDown() {
      // Close the browser
      driver.quit();
  }
  
}
