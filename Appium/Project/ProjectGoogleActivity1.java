package activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

public class ProjectGoogleActivity1 {
    // Driver Declaration
    AndroidDriver driver;
    WebDriverWait wait;

    // Set up method
    @BeforeClass
    public void setUp() throws MalformedURLException, URISyntaxException {
        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.google.android.apps.tasks");
        options.setAppActivity(".ui.TaskListsActivity");
        options.noReset();

        // Set the Appium server URL
        URL serverURL = new URI("http://localhost:4723").toURL();

        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        // Open the page in Chrome
  //      driver.get("https://v1.training-support.net/selenium");
    }

    // Test method
    @Test
 
		public void googleTest() {
    	wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//com.google.android.material.floatingactionbutton.FloatingActionButton[@content-desc='Create new task']")));
    	 driver.findElement(AppiumBy.accessibilityId("Create new task")).click();
    	 
    	// Enter text to add task
    	 wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.EditText[@resource-id='com.google.android.apps.tasks:id/add_task_title']")));
    	 driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id='com.google.android.apps.tasks:id/add_task_title']")).sendKeys("Complete Activity with Google Tasks");
    	 
    	 // Press Save
         driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_done")).click();
    	 
    	 //Adding second task
         wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//com.google.android.material.floatingactionbutton.FloatingActionButton[@content-desc='Create new task']")));
    	 driver.findElement(AppiumBy.accessibilityId("Create new task")).click();
    	 
    	// Enter text to add task
    	 wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.EditText[@resource-id='com.google.android.apps.tasks:id/add_task_title']")));
    	 driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id='com.google.android.apps.tasks:id/add_task_title']")).sendKeys("Complete Activity with Google Keep");
    	 
    	 // Press Save
         driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_done")).click();
         
         //Adding third task
         wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//com.google.android.material.floatingactionbutton.FloatingActionButton[@content-desc='Create new task']")));
    	 driver.findElement(AppiumBy.accessibilityId("Create new task")).click();
    	 
    	// Enter text to add task
    	 wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.EditText[@resource-id='com.google.android.apps.tasks:id/add_task_title']")));
    	 driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id='com.google.android.apps.tasks:id/add_task_title']")).sendKeys("Complete the second Activity Google Keep");
    	 
    	 // Press Save
         driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_done")).click();
         
      // Assertion
         wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.google.android.apps.tasks:id/task_name\" and @text=\"Complete the second Activity Google Keep\"]")));
         String taskAddedLast = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.google.android.apps.tasks:id/task_name\" and @text=\"Complete the second Activity Google Keep\"]")).getText();
         Assert.assertEquals(taskAddedLast, "Complete the second Activity Google Keep");
         
         // Assertion
         wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.google.android.apps.tasks:id/task_name\" and @text=\"Complete the second Activity Google Keep\"]")));
         String taskAddedSecond = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.google.android.apps.tasks:id/task_name\" and @text=\"Complete Activity with Google Keep\"]")).getText();
         Assert.assertEquals(taskAddedSecond, "Complete Activity with Google Keep");
         
         // Assertion
         wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.google.android.apps.tasks:id/task_name\" and @text=\"Complete the second Activity Google Keep\"]")));
         String taskAddedFirst = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.google.android.apps.tasks:id/task_name\" and @text=\"Complete Activity with Google Tasks\"]")).getText();
         Assert.assertEquals(taskAddedFirst, "Complete Activity with Google Tasks");
       
    }


    // Tear down method
 /*   @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();
    } */
}