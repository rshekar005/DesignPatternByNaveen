package com.seleniumwithdecorator;

import org.openqa.selenium.WebElement;

public abstract class WebElementDecoratorBase  implements WebElementDecorator{

    protected WebElementDecorator webElementDecorator;

    public WebElementDecoratorBase(WebElementDecorator webElementDecorator) {
        this.webElementDecorator = webElementDecorator;
    }

    @Override
    public void click(WebElement webElement){
        webElementDecorator.click(webElement);
    };

    @Override
    public void sendKeys(WebElement webElement, String text){
        webElementDecorator.sendKeys(webElement,text);
    };
}
