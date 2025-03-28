package com.seleniumwithstrategy;

import org.openqa.selenium.WebDriver;

public class DriverContext {
    private TestExecutionStrategy testExecutionStrategy;

    public DriverContext(TestExecutionStrategy testExecutionStrategy) {
        this.testExecutionStrategy = testExecutionStrategy;
    }

    public void setTestExecutionStrategy(TestExecutionStrategy testExecutionStrategy) {
        this.testExecutionStrategy = testExecutionStrategy;
    }

    public WebDriver setUpDriver(String browserName) {
        return testExecutionStrategy.setUpDriver(browserName);
    }

}
