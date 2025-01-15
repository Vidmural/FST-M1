package activities;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity21 {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the page
        driver.get("https://training-support.net/webelements/tabs");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());
        
        // Print the current page handle
        System.out.println("Page handle is: " + driver.getWindowHandle());

        // Find button to open new tab
        driver.findElement(By.xpath("//button[contains(text(),'Open')]")).click();
        // Wait for the new tab to open
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        // Print all window handles
        System.out.println("Currently open windows: " + driver.getWindowHandles());

        // Switch to the new tab
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

                   
        // Print the title and heading of the new page
        System.out.println("Page title is : " + driver.getTitle());
        
        // Print the current page handle
        System.out.println("Page handle is: " + driver.getWindowHandle());
       
        //Print the message on the page
        System.out.println("Page message is: " + driver.findElement(By.cssSelector("h2.mt-5")).getText());

        // Close the browser
        driver.quit();
    }
}