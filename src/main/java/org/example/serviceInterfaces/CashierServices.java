package org.example.serviceInterfaces;

import org.example.dto.CustomerPurchasePriorityDTO;
import org.example.dto.PurchaseListDto;
import org.example.dto.ReceiptDto;
import org.example.model.Customer;
import org.example.model.Store;

import java.util.LinkedList;
import java.util.List;

public interface CashierServices {
    ReceiptDto SellItemsAndIssueReceipt(Customer customer, PurchaseListDto purchaseListDto);
    List<ReceiptDto> sellItemsAndIssueReceiptBaseOnPriority (LinkedList<CustomerPurchasePriorityDTO> customers, Store store);

}
