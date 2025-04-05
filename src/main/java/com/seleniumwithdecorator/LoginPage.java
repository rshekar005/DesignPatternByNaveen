package com.seleniumwithdecorator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver webDriver;
    private WebElementDecorator webElementActions;
    @FindBy(css = "#input-email")
    private WebElement emailField;

    @FindBy(css = "#input-password")
    private WebElement passwordField;

    @FindBy(css = "input[class='btn btn-primary']")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.webDriver = driver;
        PageFactory.initElements(webDriver,this);
       // webElementActions = new WebElementActions();

        //2. chain decorators: WaitDecorator wraps loggingDecorator which wraps webElementActions
        //webElementActions = new WaitDecorator(new LoggingDecorator(new WebElementActions()), webDriver);

        //3. chain decorators: WaitDecorator wraps webElementActions
        webElementActions=new LoggingDecorator(new WebElementActions());
    }

    public String login(String email, String password) {
        webElementActions.sendKeys(emailField, email);
        webElementActions.sendKeys(passwordField, password);
        webElementActions.click(loginButton);
        return webDriver.getTitle();
    }

}
