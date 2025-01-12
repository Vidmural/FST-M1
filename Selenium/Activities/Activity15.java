package activities;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity15 {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the page
        driver.get("https://training-support.net/webelements/dynamic-attributes");
        // Print the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        // Find the fullname field and enter the details
        driver.findElement(By.xpath("//input[starts-with(@id, 'full-name')]")).sendKeys("Vidya M");
        driver.findElement(By.xpath("//input[contains(@id, '-email')]")).sendKeys("vidmural@in.ibm.com");
        driver.findElement(By.xpath("//input[contains(@name, '-event-date-')]")).sendKeys("2025-01-14");
        driver.findElement(By.xpath("//textarea[contains(@id, '-additional-details-')]")).sendKeys("Happy Sankranthi !!");
      
        // Find and click the submit button
        driver.findElement(By.xpath("//button[text()='Submit']")).click();

        // Wait for the success message and print it
        String message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation"))).getText();
        System.out.println(message);

        // Close the browser
        driver.quit();
    }
}