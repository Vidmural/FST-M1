# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By

# Start the Driver
with webdriver.Firefox() as driver:
    # Navigate to the URL
    driver.get("https://alchemy.hguy.co/jobs")

    # Print the title of the page
    print("Page title is: ", driver.title)

       # Print the title of the new page
    print("New page title is: ", driver.title)