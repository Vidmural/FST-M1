# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By

# Start the Driver
with webdriver.Firefox() as driver:
    # Navigate to the URL
    driver.get("https://alchemy.hguy.co/jobs")

    # Print the header of the page
    page_heading = driver.find_element(By.CLASS_NAME, "entry-title")
    print("Page heading is: ", page_heading.text)
    