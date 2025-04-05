package com.seleniumWithDecorator;

import com.seleniumwithdecorator.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Set up the WebDriver and navigate to the login page
        System.out.println("Setting up the WebDriver and navigating to the login page.");
        // This is where you would initialize the WebDriver and open the browser
        // For example:
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
    }

    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage(driver);
        String actualTitle=loginPage.login("may2024@open.com","Selenium@12345");
        //Assert.assertEquals(actualTitle,"My Account", "Login failed, title does not match.");

    }

    public void tearDown() {
        // Close the browser
        System.out.println("Closing the browser.");
        if (driver != null) {
            driver.quit();
        }
    }
}
