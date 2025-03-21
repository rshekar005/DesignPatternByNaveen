package com.singletonpattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.Serializable;

/**
 * {@code WebDriverManager} class manages WebDriver instances using the Singleton pattern
 * to ensure that only one instance of the manager is created. It also uses ThreadLocal
 * to manage WebDriver instances for each thread, allowing parallel test execution.
 */
public class WebDriverManager implements Serializable {

    private static volatile WebDriverManager instance;

    private static ThreadLocal<WebDriver> tdriver=new ThreadLocal<>();

    /**
     * Private constructor to prevent direct instantiation of the {@code WebDriverManager} class.
     */
    private WebDriverManager(){
    }

    /**
     * Initializes the WebDriver based on the specified browser type.
     *
     * @param browser The name of the browser to initialize (e.g., "chrome", "firefox", "edge").
     * @throws RuntimeException if an unsupported browser is specified.
     */
    private void initDriver(String browser){
        switch (browser){
            case "chrome":
                tdriver.set(new ChromeDriver());
                break;
            case "firefox":
                tdriver.set(new FirefoxDriver());
                break;
            case "edge":
                tdriver.set(new EdgeDriver());
                break;
            default:
                throw new RuntimeException("Unsupported browser :"+browser);
        }
    }

    /**
     * Returns the single instance of the {@code WebDriverManager} class. If an instance
     * does not already exist, it creates a new instance within a thread-safe block using
     * double-checked locking. It also initializes the WebDriver if it hasn't been already.
     *
     * @param browser The name of the browser to initialize (e.g., "chrome", "firefox", "edge").
     * @return The single instance of the {@code WebDriverManager} class.
     */
    public static WebDriverManager getInstance(String browser){
        if(instance==null){
            synchronized (WebDriverManager.class){
                if(instance==null){
                    instance=new WebDriverManager();
                }
            }
        }
        if(tdriver.get()==null){
            instance.initDriver(browser);
        }
        return instance;
    }

    /**
     * Gets the WebDriver instance associated with the current thread.
     *
     * @return The WebDriver instance for the current thread.
     */
    public WebDriver getDriver(){
        return tdriver.get();
    }

    /**
     * Quits the WebDriver instance associated with the current thread and removes
     * the ThreadLocal variable to avoid memory leaks.
     */
    public static void quitBrowser(){
        if(tdriver!=null){
            tdriver.get().quit();
            tdriver.remove();
        }
    }


}