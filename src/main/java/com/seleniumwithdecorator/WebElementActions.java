package com.seleniumwithdecorator;

import org.openqa.selenium.WebElement;

public class WebElementActions implements WebElementDecorator{
    @Override
    public void click(WebElement webElement) {
        webElement.click();
    }

    @Override
    public void sendKeys(WebElement webElement, String text) {
        webElement.sendKeys(text);
    }
}
