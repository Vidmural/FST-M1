package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity16 {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://training-support.net/webelements/selects");
        // Print the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        // Find the dropdown
        WebElement select1 = driver.findElement(By.tagName("select"));
        // Pass the WebElement to the Select object
        Select dropdown = new Select(select1);

        // Select the second option using visible text
        dropdown.selectByVisibleText("Two");
        // Print the selected option
        System.out.println("Selected Second option: " + dropdown.getFirstSelectedOption().getText());

        // Select the third option using index
        dropdown.selectByIndex(3);
        // Print the selected option
        System.out.println("Selected Third option: " + dropdown.getFirstSelectedOption().getText());

        // Select the fourth option using value attribute
        dropdown.selectByValue("four");
        // Print the selected option
        System.out.println("Selected Fourth option: " + dropdown.getFirstSelectedOption().getText());

        // Get all the options and print them to console
        
        System.out.println("Options in the dropdown: ");
        for(WebElement option : dropdown.getOptions()) {
            System.out.println(option.getText());
        }

        // Close the browser
        driver.quit();
    }
}