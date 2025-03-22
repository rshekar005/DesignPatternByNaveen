package com.seleniumwithbuilder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * {@code RegisterPage} class represents the registration page of a web application.
 * It provides methods to interact with the registration form elements.
 */
public class RegisterPage {
    private WebDriver driver;

    private By firstname=By.cssSelector("#input-firstname");
    private By surname=By.cssSelector("#input-lastname");
    private By email=By.cssSelector("#input-email");
    private By telephone=By.cssSelector("#input-telephone");
    private By password=By.cssSelector("#input-password");
    private By confirmPassword=By.cssSelector("#input-confirm");

    /**
     * Constructs a {@code RegisterPage} object with the specified WebDriver.
     *
     * @param driver The WebDriver instance to use for interacting with the registration page.
     */
    public RegisterPage(WebDriver driver){
        this.driver=driver;
    }

    /**
     * Fills the registration form with the provided registration details.
     *
     * @param register A {@link Register} object containing the registration details.
     */
    public void userRegister(Register register){
        driver.findElement(firstname).sendKeys(register.getFirstname());
        driver.findElement(surname).sendKeys(register.getSurname());
        driver.findElement(email).sendKeys(register.getEmail());
        driver.findElement(telephone).sendKeys(register.getTelephone());
        driver.findElement(password).sendKeys(register.getPassword());
        driver.findElement(confirmPassword).sendKeys(register.getConfirmPassword());
    }

}