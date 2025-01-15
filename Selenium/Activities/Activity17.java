package activities;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity17 {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://training-support.net/webelements/selects");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());

        // Find the dropdown
        WebElement select2 = driver.findElement(By.xpath("//select[@multiple='']"));
        // Pass the WebElement to the Select object
        Select multiSelect = new Select(select2);

        // Select "HTML" using visible text
        multiSelect.selectByVisibleText("HTML");
        
        // Select 4th, 5th, and 6th index options
        for (int i = 3; i <= 5; i++) {
            multiSelect.selectByIndex(i);
        }
        // Select "Node" using value attribute
        multiSelect.selectByValue("nodejs");        
     

        // Deselect the 5th index option
        multiSelect.deselectByIndex(4);
        
        // options that are currently selected
        System.out.println("Selected options are: ");
        List<WebElement> selectedOptions = multiSelect.getAllSelectedOptions();
        
        for (WebElement selectedOption : selectedOptions) {
            System.out.println(selectedOption.getText());
        }
        
        // Close the browser
        driver.quit();
    }
}
