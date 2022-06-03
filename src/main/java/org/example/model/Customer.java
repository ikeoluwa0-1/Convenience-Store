package org.example.model;

import org.example.dto.CustomerPurchasePriorityDTO;
import org.example.dto.PurchaseListDto;
import org.example.exceptions.OutOfStockException;
import org.example.serviceInterfaces.CustomerInterface;

import java.util.*;

public class Customer extends Person implements CustomerInterface {
    private  double amountBalance=0.00;
    private List<String> listOfItemsToBuy = new ArrayList<>();


    public Customer() {
    }

    public Customer(double amountBalance, List<String> listOfItemsToBuy) {
        this.amountBalance = amountBalance;
        this.listOfItemsToBuy = listOfItemsToBuy;
    }

    public Customer(String name, String mobileNumber, int age, String emailAddress, double amountBalance, List<String> listOfItemsToBuy) {
        super(name, mobileNumber, age, emailAddress);
        this.amountBalance = amountBalance;
        this.listOfItemsToBuy = listOfItemsToBuy;
    }

    public double getAmountBalance() {
        return amountBalance;
    }

    public void setAmountBalance(double amountBalance) {
        this.amountBalance = amountBalance;
    }

    public List<String> getListOfItemsToBuy() {
        return listOfItemsToBuy;
    }

    public void setListOfItemsToBuy(List<String> listOfItemsToBuy) {
        this.listOfItemsToBuy = listOfItemsToBuy;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "amountBalance=" + amountBalance +
                ", listOfItemsToBuy=" + listOfItemsToBuy +
                '}';
    }

    @Override
    public PurchaseListDto purchaseList (List<String> itemsToBuy, Store store) {
        List<Product> storeProducts = store.getProductStore();
        List<String> itemsAvailable = new ArrayList<>();
        double totalAmountOfAvailableItems = 0.00;

        for(int i =0; i<storeProducts.size(); i++) {
            for(int j=0; j<itemsToBuy.size(); j++) {
                if(Objects.equals(itemsToBuy.get(j), storeProducts.get(i).getProductName())) {
                    if(storeProducts.get(i).getQuantity()==0) {
                        throw new OutOfStockException("Product "+storeProducts.get(i).getProductId() + " is out of stock");
                    } else {
                        itemsAvailable.add(itemsToBuy.get(j));
                        totalAmountOfAvailableItems += storeProducts.get(i).getPriceTag();
                        storeProducts.get(i).setQuantity(storeProducts.get(i).getQuantity()-1);
                    }
                }
            }
        }

        PurchaseListDto purchaseListDto = new PurchaseListDto();
            purchaseListDto.setCustomerName(this.getName());
            purchaseListDto.setProductsAvailable(itemsAvailable);
            purchaseListDto.setTotalPriceAccumulated(totalAmountOfAvailableItems);

        return purchaseListDto;
    }

}

