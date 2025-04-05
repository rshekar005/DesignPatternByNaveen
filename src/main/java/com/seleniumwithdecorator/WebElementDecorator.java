package com.seleniumwithdecorator;

import org.openqa.selenium.WebElement;

public interface WebElementDecorator {
    void click(WebElement webElement);
    void sendKeys(WebElement webElement, String text);
}
