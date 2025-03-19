package com.singletonpattern;

/**
 * {@code com.singletonpattern.BrowserTest} class to demonstrate the Singleton pattern in a multithreaded environment.
 * It creates multiple threads, each accessing the single instance of the {@code Browser} class.
 */
public class BrowserTest {
    /**
     * Main method to execute the multithreaded test.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        /**
         * A {@code Runnable} task that gets the instance of the {@code Browser} and calls the {@code getInfo} method.
         */
        Runnable task = () -> {
            Browser browser = Browser.getInstance();
            browser.getInfo();
        };
       /**
        * Creating multiple threads to simulate concurrent access to the {@code Browser} instance.
        */
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);
        Thread thread4 = new Thread(task);
        Thread thread5 = new Thread(task);
        /**
        * Starting all the threads.
        */
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        /**
        * Waiting for all threads to complete their execution.
        */
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
