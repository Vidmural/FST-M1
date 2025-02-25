# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains

# Start the Driver
with webdriver.Firefox() as driver:
    # Navigate to the URL
    driver.get("https://alchemy.hguy.co/jobs/wp-admin")

    # Navigate to backend page
    driver.find_element(By.ID, "user_login").send_keys("root")
    driver.find_element(By.ID, "user_pass").send_keys("pa$$w0rd")
    driver.find_element(By.ID, "wp-submit").click()
    print("Page title is: ", driver.title)
    
    driver.find_element(By.ID, "menu-posts-job_listing").click()
    driver.find_element(By.XPATH, "//div/a[contains(@href,'/jobs/wp-admin/post-new')]").click()
    pop_wind = driver.find_element(By.XPATH, "//*[@class='components-button has-icon']")
    action = ActionChains(driver)
    action.move_to_element(pop_wind).click().perform()
    driver.find_element(By.CLASS_NAME, "block-editor-writing-flow__click-redirect").click()
    driver.find_element(By.XPATH, "//*[@class='wp-block-freeform block-library-rich-text__tinymce mce-content-body html5-captions mce-edit-focus']").send_keys("FST Automation Tester")
    driver.find_element(By.ID, "_company_website").send_keys("IBM")
    driver.find_element(By.ID, "_company_name").send_keys("IBM")
    driver.find_element(By.XPATH, "//div/button[@class='components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary' or contains(@text,'Publish')]").click()
    driver.find_element(By.XPATH, "//div/button[@class='components-button editor-post-publish-button editor-post-publish-button__button is-primary' or contains(@text,'Publish')]").click()
    driver.find_element(By.XPATH, "//div/a[contains(@href,'/jobs/job')]").click()
   