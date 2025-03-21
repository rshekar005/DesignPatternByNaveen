package com.singletonpattern;

/**
 * {@code BrowserClone} class demonstrates the prevention of cloning for the {@code Browser} Singleton class.
 * It attempts to clone a {@code Browser} instance and catches the {@code CloneNotSupportedException} that is thrown.
 */
public class BrowserClone {
    /**
     * Main method to execute the cloning test.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Get the singleton instance of the Browser class.
        Browser instance1 = Browser.getInstance();
        try {
            // Attempt to clone the Browser instance.
            Browser instance2 = (Browser) instance1.clone();
        } catch (CloneNotSupportedException e) {
            // Catch the CloneNotSupportedException, which is thrown because cloning is prevented in the Browser class.
            throw new RuntimeException(e);
        }
    }
}