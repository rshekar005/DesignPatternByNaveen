package com.seleniumwithfactory;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest {

    WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = DriverFactory.getDriver("firefox").createDriver();
    }

    @Test
    public void titleTest() {
        driver.get("https://www.facebook.com/");
        Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}
