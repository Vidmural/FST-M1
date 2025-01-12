package activities;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity13 {
    public static void main(String[] args) {
        // Initialize the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://training-support.net/webelements/tables");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());

        // Print the number of columns
        List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/thead/tr/th"));
       
        // Print the number of rows
        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr"));
      
        System.out.println("Number of rows: " + rows.size());
        System.out.println("Number of columns: " + cols.size());
      
        // Print the third row
        WebElement thirdRow = driver.findElement(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr[3]"));
        System.out.println("Third row:  " + thirdRow.getText());
        

        // Print the cell value of the second row and second column
        WebElement row2cell2 = driver.findElement(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr[2]/td[2]"));
        System.out.println("Second row, second cell value:  " + row2cell2.getText());

        // Close the browser
        driver.quit();
    }
}