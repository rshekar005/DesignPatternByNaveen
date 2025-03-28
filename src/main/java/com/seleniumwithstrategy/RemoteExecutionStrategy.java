package com.seleniumwithstrategy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteExecutionStrategy implements TestExecutionStrategy {
    @Override
    public WebDriver setUpDriver(String browserName) {
        switch (browserName.toLowerCase().trim()) {
            case "chrome":
                ChromeOptions chromeOptions=new ChromeOptions();
                try {
                    return new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeOptions);
                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                }
            case "firefox":
                return new FirefoxDriver();
            case "edge":
                return new EdgeDriver();
            default:
                System.out.println("Invalid browser name: " + browserName);
                throw new IllegalStateException("WRONG BROWSER NAME");
        }
    }
}
