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

public class Activity7 {
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
	  driver.findElement(By.id("menu-item-26")).click();
	  String jobsheading = driver.findElement(By.id("menu-item-26")).getText();
	  System.out.println("Page Title " + jobsheading);
	  System.out.println("Page Title " + driver.getTitle());
     assertEquals(driver.getTitle(), "Post a Job – Alchemy Jobs");
      driver.findElement(By.xpath("//div/a[@class='button' or contains(@text,'Sign In')]")).click();
      driver.findElement(By.id("user_login")).sendKeys("root");
      driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
      driver.findElement(By.id("wp-submit")).click();
      driver.findElement(By.id("job_title")).sendKeys("FSTT Tester");
      driver.findElement(By.id("job_description_ifr")).sendKeys(" FSTT Tester Automation");
      driver.findElement(By.xpath("//p/input[@class='button' or contains(@text,'Preview')]")).click();
      driver.findElement(By.id("job_preview_submit_button")).click();
    //  driver.findElement(By.xpath("//div/a[@class='entry-content clear' or contains(@text,'click here')]")).click();
      driver.findElement(By.xpath("//div/a[contains(@href,'/jobs/job')]")).click();
  
  }
  
   /* 
  @AfterClass
  public void tearDown() {
      // Close the browser
      driver.quit();
  }
  */
}
