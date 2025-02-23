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
    driver.find_element(By.XPATH, "//div/a[@class='button' or contains(@text,'Sign In')]").click()
    driver.find_element(By.ID, "user_login").send_keys("root")
    driver.find_element(By.ID, "user_pass").send_keys("pa$$w0rd")
    driver.find_element(By.ID, "wp-submit").click()
    driver.find_element(By.ID, "job_title").send_keys("FSTT Tester")
    driver.find_element(By.ID, "job_description_ifr").send_keys(" FSTT Tester Automation")
    driver.find_element(By.XPATH, "//p/input[@class='button' or contains(@text,'Preview')]").click()
    driver.find_element(By.ID, "job_preview_submit_button").click()
    driver.find_element(By.XPATH, "//div/a[contains(@href,'/jobs/job')]").click()