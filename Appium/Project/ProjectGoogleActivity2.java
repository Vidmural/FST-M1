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

public class ProjectGoogleActivity2 {
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
        options.setAppPackage("com.google.android.keep");
        options.setAppActivity(".activities.BrowseActivity");
        options.noReset();

        // Set the Appium server URL
        URL serverURL = new URI("http://localhost:4723").toURL();

        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        }

    // Test method
    @Test
 
		public void googleTest() {
    	wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//com.google.android.material.floatingactionbutton.FloatingActionButton[@content-desc=\"Create a note\"]")));
    	 driver.findElement(AppiumBy.accessibilityId("Create a note")).click();
    	 wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.Button[@content-desc=\"New text note\"]")));
    	 driver.findElement(AppiumBy.accessibilityId("New text note")).click();
    	 
    	// Enter text to add Google Keep Note
    	 wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.google.android.keep:id/editable_title\"]")));
    	 driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.google.android.keep:id/editable_title\"]")).sendKeys("MyNote");
    	 
    	 wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.EditText[@resource-id='com.google.android.keep:id/edit_note_text']")));
    	 driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id='com.google.android.keep:id/edit_note_text']")).sendKeys("Note task complete");
    	 
    	 // Press Back
    	 wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.ImageButton[@content-desc='Navigate up']")));
         driver.findElement(AppiumBy.accessibilityId("Navigate up")).click();
    	 
         //Assertions
         wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.google.android.keep:id/index_note_title\"]")));
         String listAdded = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.google.android.keep:id/index_note_title\"]")).getText();
         Assert.assertEquals(listAdded, "MyNote");
       }

    // Tear down method
 /*   @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();
    } */
}