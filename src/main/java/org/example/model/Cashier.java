package org.example.model;

import org.example.dto.CustomerPurchasePriorityDTO;
import org.example.dto.PurchaseListDto;
import org.example.dto.ReceiptDto;
import org.example.exceptions.InsufficientFundException;
import org.example.serviceInterfaces.CashierServices;

import java.util.*;

public class Cashier extends Person implements CashierServices {
    private String tagNumber;

    public Cashier() {
    }

    public Cashier(String tagNumber) {
        this.tagNumber = tagNumber;
    }

    public String getTagNumber() {
        return tagNumber;
    }

    public void setTagNumber(String tagNumber) {
        this.tagNumber = tagNumber;
    }

    public void sell(Customer customer, String product , int price){

    }


    @Override
    public ReceiptDto SellItemsAndIssueReceipt(Customer customer, PurchaseListDto purchaseListDto){
            ReceiptDto receipt = new ReceiptDto();
        if (customer.getAmountBalance() >= purchaseListDto.getTotalPriceAccumulated()){
            receipt.setCustomerName(purchaseListDto.getCustomerName());
            receipt.setPurchasedItems(purchaseListDto.getProductsAvailable());
            receipt.setTotalPrice(purchaseListDto.getTotalPriceAccumulated());
            receipt.setDatePurchased(new Date());

            customer.setAmountBalance(customer.getAmountBalance() - purchaseListDto.getTotalPriceAccumulated());
        }
        else {
            throw new InsufficientFundException(customer.getName()
                    + " You do not have sufficient fund for this purchase");
        }
        return receipt;
    }

    @Override
    public List<ReceiptDto> sellItemsAndIssueReceiptBaseOnPriority(LinkedList<CustomerPurchasePriorityDTO> customers, Store store) {
        List<Product> products = store.getProductStore();
        List<ReceiptDto> listOfReceipt = new ArrayList<>();

        for(CustomerPurchasePriorityDTO cust : customers) {
            for(int i=0; i<products.size(); i++) {
                if(Objects.equals(cust.getProductName(), products.get(i).getProductName())) {
                    if(products.get(i).getQuantity()!=0) {
        double totalAmountOfProductsToBuy = 0.00;
                        totalAmountOfProductsToBuy +=(products.get(i).getPriceTag()*cust.getQuantity());
                        products.get(i).setQuantity(products.get(i).getQuantity() - cust.getQuantity());
                        List<String> itemsBought = new ArrayList<>();
                                                    itemsBought.add(cust.getProductName());
                        ReceiptDto rec = new ReceiptDto();
                                        rec.setCustomerName(cust.getCustomerName());
                                        rec.setTotalPrice(totalAmountOfProductsToBuy);
                                        rec.setDatePurchased(new Date());
                                        rec.setPurchasedItems(itemsBought);
                                        listOfReceipt.add(rec);
                    } else {
                        System.out.println(products.get(i).getProductName() + " is out of stock");
                    }
                }
            }
        }
        return listOfReceipt;
    }


    @Override
    public String toString() {
        return "Cashier{" +
                "tagNumber='" + tagNumber + '\'' +
                '}';
    }
}






