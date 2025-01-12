package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {
    public static void main(String[] args) {
        // Initialize the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://training-support.net/webelements/dynamic-controls");
        
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());

        // Find the checkbox element
        WebElement checkbox = driver.findElement(By.id("checkbox"));
                     
        // Print the visibility of the checkbox
        System.out.println("Is the checkbox selected: " + checkbox.isSelected());
        
        // Find and click the button to toggle checkbox
        checkbox.click();
        
        // Print the visibility of the checkbox
        System.out.println("Is the checkbox selected: " + checkbox.isSelected());

        // Close the browser
        driver.quit();
    }
}