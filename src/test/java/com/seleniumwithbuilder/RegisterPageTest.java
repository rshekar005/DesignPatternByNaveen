package com.seleniumwithbuilder;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegisterPageTest {

    WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
    }

    @Test
    public void userRegTest() {
        Register register = new Register.RegisterBuilder()
                .setFirstname("Rajashekar")
                .setSurname("Pillalamarri")
                .setEmail("shekar005@gmail.com")
                .setPassword("1234")
                .setConfirmPassword("1234")
                .setTelephone("010")
                .build();

        RegisterPage registerPage=new RegisterPage(driver);
        registerPage.userRegister(register);
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
