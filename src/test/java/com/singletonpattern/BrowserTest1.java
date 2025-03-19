package com.singletonpattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * {@code BrowserTest1} class demonstrates breaking the Singleton pattern using reflection.
 * It obtains a second instance of the {@code Browser} class, which should normally be prevented by the Singleton pattern.
 */
public class BrowserTest1 {
    /**
     * Main method to execute the test that breaks the Singleton pattern using reflection.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Get the first instance of the Browser class using the getInstance() method.
        Browser instance1=Browser.getInstance();
        Browser instance2=null;

        try {
            // Use reflection to access the private constructor of the Browser class.
            Constructor<Browser> constructor= Browser.class.getDeclaredConstructor();
            // Make the private constructor accessible.
            constructor.setAccessible(true);
            // Create a new instance of the Browser class using the accessible constructor.
            instance2=constructor.newInstance();
            // Print the hash codes of both instances to demonstrate that they are different.
            System.out.println("hascode of instance1 " +instance1.hashCode());
            System.out.println("hascode of instance2 " +instance2.hashCode());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}