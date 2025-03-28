package com.seleniumwithstratergy;

import com.seleniumwithstrategy.DriverContext;
import com.seleniumwithstrategy.HeadlessExecutionStrategy;
import com.seleniumwithstrategy.LocalExecutionStrategy;
import org.openqa.selenium.WebDriver;

public class DriverTest {
    public static void main(String[] args) {
        DriverContext driverContext = new DriverContext(new HeadlessExecutionStrategy());
        WebDriver driver=driverContext.setUpDriver("chrome");
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());

        driverContext.setTestExecutionStrategy(new LocalExecutionStrategy());
        driver=driverContext.setUpDriver("edge");
        driver.get("https://www.youtube.com");
        System.out.println(driver.getTitle());
    }
}
