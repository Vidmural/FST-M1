# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By

# Start the Driver
with webdriver.Firefox() as driver:
    # Navigate to the URL
    driver.get("https://alchemy.hguy.co/jobs")

    # Navigate to Jobs page
        
    driver.find_element(By.ID, "menu-item-24").click()
    page_heading = driver.find_element(By.ID, "menu-item-24")
    print("Page heading is: ", page_heading.text)
    
    # Print the title of the page
    print("Page title is: ", driver.title)