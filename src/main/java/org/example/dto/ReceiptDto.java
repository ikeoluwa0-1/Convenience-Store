package org.example.dto;

import java.util.Date;
import java.util.List;

public class ReceiptDto {
    private String customerName;
    private double totalPrice;
    private List<String> purchasedItems;
    private Date datePurchased;

    public ReceiptDto() {
    }

    public ReceiptDto(String customerName, double totalPrice, List<String> purchasedItems, Date datePurchased) {
        this.customerName = customerName;
        this.totalPrice = totalPrice;
        this.purchasedItems = purchasedItems;
        this.datePurchased = datePurchased;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<String> getPurchasedItems() {
        return purchasedItems;
    }

    public void setPurchasedItems(List<String> purchasedItems) {
        this.purchasedItems = purchasedItems;
    }

    public Date getDatePurchased() {
        return datePurchased;
    }

    public void setDatePurchased(Date datePurchased) {
        this.datePurchased = datePurchased;
    }


    @Override
    public String toString() {
        return "\n*************INVOICE*************** \n"+
                "customerName='" + customerName + '\n' +
                "TotalPrice=" + totalPrice +'\n' +
                "PurchasedItems=" + purchasedItems +'\n' +
                "DatePurchased=" + datePurchased +'\n' +
                "******************************************* \n"+
                "\n";
    }
}
