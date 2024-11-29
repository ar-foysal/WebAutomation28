package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverSetup {
    public WebDriver driver;

    @BeforeSuite
    public void openABrowser(){
        driver = new FirefoxDriver();
    }

    @AfterSuite
    public void closeBrowser(){
        // Close Browser
        driver.quit();
    }
}
