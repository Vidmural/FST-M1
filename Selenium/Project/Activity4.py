# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By

# Start the Driver
with webdriver.Firefox() as driver:
    # Navigate to the URL
    driver.get("https://alchemy.hguy.co/jobs")

    # Print the second header of the page
    second_heading = driver.find_element(By.XPATH, "//h2[contains(text(), 'Quia')]")
    print("Second heading is: ", second_heading.text)
    