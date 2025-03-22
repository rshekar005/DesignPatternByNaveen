package com.builderpattern;

/**
 * Represents a product with various attributes.
 * This class demonstrates the Builder design pattern to construct a product object
 * with both required and optional parameters.
 */
public class Product {
    //required
    private String name;
    private double price;

    //optional
    private String category;
    private String description;
    private double discount;
    private int stock;
    private boolean freeShipping;


    /**
     * Private constructor to enforce the use of the ProductBuilder.
     *
     * @param builder The ProductBuilder instance containing the product attributes.
     */
    private Product(ProductBuilder builder){
        this.name=builder.name;
        this.price=builder.price;
        this.category=builder.category;
        this.description=builder.description;
        this.discount=builder.discount;
        this.stock=builder.stock;
        this.freeShipping=builder.freeShipping;
    }

    /**
     * Returns whether the product has free shipping.
     *
     * @return True if the product has free shipping, false otherwise.
     */
    public boolean isFreeShipping() {
        return freeShipping;
    }

    /**
     * Sets whether the product has free shipping.
     *
     * @param freeShipping True if the product should have free shipping, false otherwise.
     */
    public void setFreeShipping(boolean freeShipping) {
        this.freeShipping = freeShipping;
    }

    /**
     * Returns the stock quantity of the product.
     *
     * @return The stock quantity.
     */
    public int getStock() {
        return stock;
    }

    /**
     * Sets the stock quantity of the product.
     *
     * @param stock The stock quantity to set.
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Returns the discount of the product.
     *
     * @return The discount value.
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * Sets the discount of the product.
     *
     * @param discount The discount value to set.
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    /**
     * Returns the description of the product.
     *
     * @return The description of the product.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the product.
     *
     * @param description The description to set.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns the category of the product.
     *
     * @return The category of the product.
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the category of the product.
     *
     * @param category The category to set.
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Returns the price of the product.
     *
     * @return The price of the product.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price of the product.
     *
     * @param price The price to set.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Returns the name of the product.
     *
     * @return The name of the product.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the product.
     *
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns a string representation of the Product object.
     *
     * @return A string representation of the Product.
     */
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", discount=" + discount +
                ", stock=" + stock +
                ", freeShipping=" + freeShipping +
                '}';
    }

    /**
     *  {@code ProductBuilder} is a static nested class that helps construct {@code Product} objects.
     *  It follows the Builder design pattern, allowing for a more readable and maintainable way
     *  to create objects with a large number of optional parameters.
     */
    public static class ProductBuilder{
        //required
        private String name;
        private double price;

        //optional
        private String category;
        private String description;
        private double discount;
        private int stock;
        private boolean freeShipping;

        /**
         * Constructs a ProductBuilder with the required parameters.
         *
         * @param name  The name of the product (required).
         * @param price The price of the product (required).
         */
        public ProductBuilder(String name, double price) {
            this.name = name;
            this.price = price;
        }

        /**
         * Sets the category for the product.
         *
         * @param category The category of the product.
         * @return This ProductBuilder instance for chaining.
         */
        public ProductBuilder setCategory(String category) {
            this.category = category;
            return this;
        }

        /**
         * Sets the description for the product.
         *
         * @param description The description of the product.
         * @return This ProductBuilder instance for chaining.
         */
        public ProductBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the discount for the product.
         *
         * @param discount The discount of the product.
         * @return This ProductBuilder instance for chaining.
         */
        public ProductBuilder setDiscount(double discount) {
            this.discount = discount;
            return this;
        }

        /**
         * Sets the stock quantity for the product.
         *
         * @param stock The stock quantity of the product.
         * @return This ProductBuilder instance for chaining.
         */
        public ProductBuilder setStock(int stock) {
            this.stock = stock;
            return this;
        }

        /**
         * Sets whether the product has free shipping.
         *
         * @param freeShipping True if the product has free shipping, false otherwise.
         * @return This ProductBuilder instance for chaining.
         */
        public ProductBuilder setFreeShipping(boolean freeShipping) {
            this.freeShipping = freeShipping;
            return this;
        }

        /**
         * Builds and returns a Product instance using the attributes set in the builder.
         * It also sets the attributes of the Product object.
         *
         * @return A new Product instance.
         */
        public Product build(){
            Product product = new Product(this);
            product.setName(this.name);
            product.setPrice(this.price);
            product.setCategory(this.category);
            product.setDescription(this.description);
            product.setDiscount(this.discount);
            product.setStock(this.stock);
            product.setFreeShipping(this.freeShipping);
            return product;
        }
    }
}