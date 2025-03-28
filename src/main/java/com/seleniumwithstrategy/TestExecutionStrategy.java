package com.seleniumwithstrategy;

import org.openqa.selenium.WebDriver;

public interface TestExecutionStrategy {
    WebDriver setUpDriver(String browserName);
}
