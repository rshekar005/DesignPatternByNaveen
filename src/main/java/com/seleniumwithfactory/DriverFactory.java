package com.seleniumwithfactory;

/**
 * {@code DriverFactory} is a factory class responsible for creating instances of {@link BrowserDriver} based on the specified browser type.
 * It uses a switch statement to determine which concrete {@link BrowserDriver} implementation to instantiate.
 */
public class DriverFactory {

    /**
     * Returns an instance of {@link BrowserDriver} based on the provided browser type.
     *
     * @param browser A string representing the browser type (e.g., "chrome", "firefox", "edge").
     *                The comparison is case-insensitive.
     * @return An instance of the corresponding {@link BrowserDriver} implementation.
     * @throws IllegalArgumentException if the specified browser is not supported.
     */
    public static BrowserDriver getDriver(String browser) {
        switch (browser.toLowerCase()) {
            case "chrome":
                return new ChromeDriverManager();
            case "firefox":
                return new FireFoxDriverManager();
            case "edge":
                return new EdgeDriverManager();
            default:
                throw new IllegalArgumentException("Browser not supported: " + browser);
        }
    }
}