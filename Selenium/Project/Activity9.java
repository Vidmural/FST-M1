package project;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity9 {
	//Declare webdriver
	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
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
  public void jobsPageTest() throws InterruptedException {
	  
	  driver.findElement(By.id("user_login")).sendKeys("root");
      driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
      driver.findElement(By.id("wp-submit")).click();
	  System.out.println("Page Title " + driver.getTitle());
      assertEquals(driver.getTitle(), "Dashboard ‹ Alchemy Jobs — WordPress");
      driver.findElement(By.id("menu-posts-job_listing")).click();
   //   driver.findElement(By.xpath("//a/div[@class='wp-menu-name' or contains(@text,'Job Listings')]")).click();
    ///  driver.findElement(By.xpath("//a[contains(@href,'/post_type=job_listing')]")).click();
      driver.findElement(By.xpath("//div/a[contains(@href,'/jobs/wp-admin/post-new')]")).click();
   
      WebElement popWind = driver.findElement(By.xpath("//*[@class='components-button has-icon']"));
      Actions actions = new Actions(driver);

      actions.moveToElement(popWind).click().perform();
    //  driver.findElement(By.className("editor-post-title")).click();
      driver.findElement(By.className("block-editor-writing-flow__click-redirect")).click();
      driver.findElement(By.xpath("//*[@class='wp-block-freeform block-library-rich-text__tinymce mce-content-body html5-captions mce-edit-focus']")).sendKeys("FST Automation Tester");
      driver.findElement(By.id("_company_website")).sendKeys("IBM");
      driver.findElement(By.id("_company_name")).sendKeys("IBM");
      driver.findElement(By.xpath("//div/button[@class='components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary' or contains(@text,'Publish')]")).click();
      driver.findElement(By.xpath("//div/button[@class='components-button editor-post-publish-button editor-post-publish-button__button is-primary' or contains(@text,'Publish')]")).click();
 //     WebElement applyElmnt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/a[contains(@href,'/jobs/job')]")));
      driver.findElement(By.xpath("//div/a[contains(@href,'/jobs/job')]")).click();
   
  }
  
   
  @AfterClass
  public void tearDown() {
      // Close the browser
      driver.quit();
  }
  
}
