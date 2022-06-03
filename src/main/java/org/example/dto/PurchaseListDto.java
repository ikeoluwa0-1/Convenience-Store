package org.example.dto;

import java.util.Date;
import java.util.List;

public class PurchaseListDto {
    private String customerName;
    private List<String> productsAvailable;
    private List<String> itemsUnavailable;
    private double totalPriceAccumulated;
    private Date dateOfPurchase = new Date();


    public PurchaseListDto() {
    }

    public PurchaseListDto(String customerName, List<String> productsAvailable,
                           List<String> itemsUnavailable, double totalPriceAccumulated, Date dateOfPurchase) {
        this.customerName = customerName;
        this.productsAvailable = productsAvailable;
        this.itemsUnavailable = itemsUnavailable;
        this.totalPriceAccumulated = totalPriceAccumulated;
        this.dateOfPurchase = dateOfPurchase;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<String> getProductsAvailable() {
        return productsAvailable;
    }

    public void setProductsAvailable(List<String> productsAvailable) {
        this.productsAvailable = productsAvailable;
    }

    public List<String> getItemsUnavailable() {
        return itemsUnavailable;
    }

    public void setItemsUnavailable(List<String> itemsUnavailable) {
        this.itemsUnavailable = itemsUnavailable;
    }

    public double getTotalPriceAccumulated() {
        return totalPriceAccumulated;
    }

    public void setTotalPriceAccumulated(double totalPriceAccumulated) {
        this.totalPriceAccumulated = totalPriceAccumulated;
    }

    public Date getDateOfPurchase() {
        return dateOfPurchase;
    }


    @Override
    public String toString() {
        return "PurchaseList{" +
                "customerName='" + customerName + '\'' +
                ", productsAvailable=" + productsAvailable +
                ", itemsUnavailable=" + itemsUnavailable +
                ", totalPriceAccumulated=" + totalPriceAccumulated +
                ", dateOfPurchase='" + dateOfPurchase + '\'' +
                '}';
    }
}
