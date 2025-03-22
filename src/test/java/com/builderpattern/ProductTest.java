package com.builderpattern;

/**
 * {@code ProductTest} class is used to test the functionality of the {@link Product} class
 * and its {@link Product.ProductBuilder} for creating product instances with different configurations.
 */
public class ProductTest {

    /**
     * Main method to demonstrate the creation and usage of {@link Product} objects
     * using the {@link Product.ProductBuilder}.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {

        //Only mandatory fields
        Product.ProductBuilder product1 = new Product.ProductBuilder("Laptop", 1000);
        Product product = product1.build();
        System.out.println(product);

        Product product2 = new Product.ProductBuilder("Samsung", 1000)
                .setCategory("TV")
                .setDescription("OLED TV")
                .setFreeShipping(false)
                .setDiscount(10)
                .setStock(50)
                .build();

        System.out.println(product2);
        product2.setDiscount(5);
        System.out.println(product2);
        System.out.println(product2.getCategory());

        Product product3 = new Product.ProductBuilder("Tshirt", 250)
                .setCategory("Fashion")
                .setFreeShipping(true)
                .setStock(10)
                .build();

        System.out.println(product3);
        product3.setDescription("black color sports tshirt");
        System.out.println(product3);

    }
}