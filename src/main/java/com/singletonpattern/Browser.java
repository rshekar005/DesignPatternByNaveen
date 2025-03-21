package com.singletonpattern;

import java.io.Serializable;


/**
 * The {@code Browser} class implements the Singleton design pattern to ensure
 * that only one instance of a browser is created throughout the application.
 * This is achieved through a private constructor and a static method that
 * provides access to the single instance.
 * <p>
 *  This class also implements the {@code Serializable} interface to handle serialization,
 *  ensuring that the Singleton pattern is not broken when the object is serialized and deserialized.
 */
public class Browser implements Serializable, Cloneable {

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


    /**
     * Method to ensure that the Singleton pattern is not broken during deserialization.
     * This method is automatically called by the serialization mechanism when an object is deserialized.
     *
     * @return The singleton instance of the {@code Browser} class.
     */
    protected Object readResolve(){
        return getInstance();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning of this class is not allowed");
    }


}
