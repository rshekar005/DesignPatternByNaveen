package com.singletonpattern;
/**
 * The {@code Browser} class implements the Singleton design pattern to ensure
 * that only one instance of a browser is created throughout the application.
 * This is achieved through a private constructor and a static method that
 * provides access to the single instance.
 */
public class Browser {

    private volatile static Browser browser;


    /**
     * Private constructor to prevent direct instantiation of the {@code Browser} class.
     * To avoid creating instance using reflection
     */
    private Browser() {
        if (browser != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    /**
     * Returns the single instance of the {@code Browser} class. If an instance
     * does not already exist, it creates a new instance within a thread-safe
     * block using double-checked locking.
     *
     * @return The single instance of the {@code Browser} class.
     */
    public static Browser getInstance(){
        if(browser==null){
            synchronized (Browser.class){
                if(browser==null){
                    browser=new Browser();
                }
            }
        }
        return browser;
    }
    /**
     * Prints a message to the console indicating that this is a browser.
     * This method can be extended to include more detailed information
     * about the browser instance.
     */
    public void getInfo(){
        System.out.println("This is a browser");
    }

}
