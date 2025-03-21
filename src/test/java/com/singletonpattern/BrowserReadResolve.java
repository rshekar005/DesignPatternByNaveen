package com.singletonpattern;

import java.io.*;

/**
 * {@code BrowserReadResolve} class demonstrates how the Singleton pattern is preserved during serialization and deserialization.
 * It serializes a {@code Browser} instance to a file and then deserializes it back, verifying that both instances are the same.
 */
public class BrowserReadResolve {
    /**
     * Main method to execute the serialization and deserialization test.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        try {
            // Get the singleton instance of the Browser class.
            Browser instance1 = Browser.getInstance();
            // Create an ObjectOutputStream to write the Browser instance to a file.
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("browser.json"));
            // Write the Browser instance to the file.
            out.writeObject(instance1);
            // Close the output stream.
            out.close();

            // Create an ObjectInputStream to read the Browser instance from the file.
            ObjectInputStream in= new ObjectInputStream(new FileInputStream("browser.json"));
            // Read the Browser instance from the file.
            Browser instance2=(Browser)in.readObject();
            // Close the input stream.
            in.close();

            // Print the hash codes of both instances to verify that they are the same.
            System.out.println("hascode of instance1 is "+instance1.hashCode());
            System.out.println("hascode of instance2 is "+instance2.hashCode());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}