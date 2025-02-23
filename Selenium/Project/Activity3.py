# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By

# Start the Driver
with webdriver.Firefox() as driver:
    # Navigate to the URL
    driver.get("https://alchemy.hguy.co/jobs")

    # Print the url of the image
    url_image = driver.find_element(By.TAG_NAME, "img")
    print("URL of image is: ", url_image.get_attribute("src"))
    