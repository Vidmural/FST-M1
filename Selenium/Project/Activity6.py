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
    
    driver.find_element(By.ID, "search_keywords").send_keys("Banking")
    driver.find_element(By.CLASS_NAME, "search_submit").click()
    driver.find_element(By.TAG_NAME, "H3").click()
    print("Page title is: ", driver.title)
    driver.find_element(By.XPATH, "//div/input[@class='application_button button']").click()
    get_email = driver.find_element(By.XPATH, "//div/p/a[@class='job_application_email']")
    print("Email ID is: ", get_email.text)