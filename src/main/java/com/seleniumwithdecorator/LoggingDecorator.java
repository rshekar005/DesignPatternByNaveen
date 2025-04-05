package com.seleniumwithdecorator;

import org.openqa.selenium.WebElement;

public class LoggingDecorator extends WebElementDecoratorBase{
    public LoggingDecorator(WebElementDecorator webElementDecorator) {
        super(webElementDecorator);
    }

    @Override
    public void click(WebElement webElement) {
        System.out.println("Clicking on element: " + webElement);
        super.click(webElement);
    }

    @Override
    public void sendKeys(WebElement webElement, String text) {
        System.out.println("Sending keys to element: " + webElement);
        super.sendKeys(webElement,text);
    }
}
