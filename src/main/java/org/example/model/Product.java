package org.example.model;

public class Product {
    private String productName;
    private String productId;
    private double priceTag;
    private String compartment;
    private int quantity;

    public Product(String productName, String productId, double priceTag, String compartment, int quantity) {
        this.productName = productName;
        this.productId = productId;
        this.priceTag = priceTag;
        this.compartment = compartment;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product() {
    }

    public Product(String productName, String productId, double priceTag, String compartment) {
        this.productName = productName;
        this.productId = productId;
        this.priceTag = priceTag;
        this.compartment = compartment;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getPriceTag() {
        return priceTag;
    }

    public void setPriceTag(double priceTag) {
        this.priceTag = priceTag;
    }

    public String getCompartment() {
        return compartment;
    }

    public void setCompartment(String compartment) {
        this.compartment = compartment;
    }


    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", title='" + productId + '\'' +
                ", priceTag=" + priceTag +
                ", compartment='" + compartment + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}


