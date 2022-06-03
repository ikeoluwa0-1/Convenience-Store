package org.example.serviceInterfaces;

import org.example.dto.CustomerPurchasePriorityDTO;
import org.example.dto.PurchaseListDto;
import org.example.model.Store;

import java.util.LinkedList;
import java.util.List;

public interface CustomerInterface {
    PurchaseListDto purchaseList(List<String> itemsToBuy, Store store);
}
