package com.seleniumwithdecorator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitDecorator extends WebElementDecoratorBase {

    private WebDriver webDriver;
    public WaitDecorator(WebElementDecorator webElementDecorator,WebDriver driver) {
        super(webElementDecorator);
        this.webDriver = driver;
    }

    @Override
    public void click(WebElement webElement) {
        WebDriverWait wait= new WebDriverWait(webDriver, Duration.ofSeconds(10));
        wait.until(driver -> webElement.isDisplayed() && webElement.isEnabled());
        System.out.println("Clicking on element using wait condition: " + webElement);
        super.click(webElement);
    }

    @Override
    public void sendKeys(WebElement webElement, String text) {
        WebDriverWait wait= new WebDriverWait(webDriver, Duration.ofSeconds(10));
        wait.until(driver -> webElement.isDisplayed() && webElement.isEnabled());
        System.out.println("Sending on element using wait condition: " + webElement);
        super.sendKeys(webElement, text);
    }
}
