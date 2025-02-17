package activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

public class ProjectChromeActivity2 {
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
        options.setAppPackage("com.android.chrome");
        options.setAppActivity("com.google.android.apps.chrome.Main");
        options.noReset();

        // Set the Appium server URL
        URL serverURL = new URI("http://localhost:4723").toURL();

        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the page in Chrome
        driver.get("https://v1.training-support.net/selenium");
    }
    

    // Test method
    @Test(priority = 1)
    public void chromeTest() {
      
    	  // Find and click the link
    	wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.view.View")));
   
    	String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
    	driver.findElement(AppiumBy.androidUIAutomator(UiScrollable + ".scrollForward(25)"));
    //	driver.findElement(AppiumBy.androidUIAutomator(UiScrollable + ".flingForward()"));
  
    	
        driver.findElement(AppiumBy.xpath(
              "//android.view.View[contains(@text,'Login ')]")).click();
        
      // driver.findElement(AppiumBy.androidUIAutomator("text(\"Sign In \")")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.EditText")));
        driver.findElement(AppiumBy.xpath(
                "//android.widget.EditText[@resource-id='username']"
        )).sendKeys("admin");
        driver.findElement(AppiumBy.xpath(
                "//android.widget.EditText[@resource-id='password']"
        )).sendKeys("password");
      
        driver.findElement(AppiumBy.xpath(
                "//android.widget.Button[@text=\"Log in\"]")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.view.View")));
        // Assertion
        String loginMessage = driver.findElement(AppiumBy.androidUIAutomator("resourceId(\"action-confirmation\")")).getText();
        Assert.assertEquals(loginMessage, "Welcome Back, admin"); 
    } 
    
     @Test
        public void chromeTestInvalid() {
          
        		  // Find and click the link
    	wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.view.View")));
   
    	String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
    	driver.findElement(AppiumBy.androidUIAutomator(UiScrollable + ".scrollForward(25)"));
    //	driver.findElement(AppiumBy.androidUIAutomator(UiScrollable + ".flingForward()"));
  
    	
        driver.findElement(AppiumBy.xpath(
              "//android.view.View[contains(@text,'Login ')]")).click();
        
      // driver.findElement(AppiumBy.androidUIAutomator("text(\"Sign In \")")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.EditText")));
        driver.findElement(AppiumBy.xpath(
                "//android.widget.EditText[@resource-id='username']"
        )).sendKeys("adminn");
        driver.findElement(AppiumBy.xpath(
                "//android.widget.EditText[@resource-id='password']"
        )).sendKeys("passworde");
      
        driver.findElement(AppiumBy.xpath(
                "//android.widget.Button[@text=\"Log in\"]")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.view.View")));
        
            // Assertion
            String loginMessage = driver.findElement(AppiumBy.androidUIAutomator("resourceId(\"action-confirmation\")")).getText();
            Assert.assertEquals(loginMessage, "Invalid Credentials");
    } 


    // Tear down method
    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();
    } 
}