package org.example;

import org.example.dto.CustomerPurchasePriorityDTO;
import org.example.model.*;
import org.example.serviceInterfaces.PriorityQueueImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Manager manager = new Manager();

        Applicant applicant = new Applicant();
        applicant.setName("Oprah George");
        applicant.setQualification(QualifiedGrade.FirstClass);
        applicant.setAge(29);

        Applicant applicant1 = new Applicant();
        applicant1.setName("Williams Godfrey");
        applicant1.setQualification(QualifiedGrade.FirstClass);
        applicant1.setAge(26);

//        manager.hire(applicant);
//        manager.hire(applicant1);

        Store store= new Store();
        Product product = new Product ("Bread","brd452",500.0,"Snack",10);
        Product product2 = new Product("Sausage","ssg008",1500.0,"Frozen",4);
        Product product3 = new Product("Serviette","svt112",1000.0,"Gift",5);
        Product product4 = new Product("PeanutButter","pnb748",2050.0,"Beverage",2);

//        manager.fillStore(product, store);

        manager.fillStore(product, store);
        manager.fillStore(product2, store);
        manager.fillStore(product3, store);
        manager.fillStore(product4, store);
//        System.out.println(store.getProductStore());

        Customer customer = new Customer();
        customer.setName("Audu");
        customer.setAmountBalance(5000.00);

        Cashier cashier = new Cashier();
//        cashier.makeSales(customer);
//        cashier.issueReceipt(customer);s
        List<String> listOfItemsToBuy = new ArrayList<>();
//
        listOfItemsToBuy.add("Sausage");
        listOfItemsToBuy.add("Bread");
        listOfItemsToBuy.add("Bread");

//        PurchaseListDto purchaseList = customer.purchaseList(listOfItemsToBuy, store);
//        System.out.println("*******************************");
//        System.out.println(purchaseList);
//        System.out.println("*******************************");
//
//        System.out.println(cashier.SellItemsAndIssueReceipt(customer, purchaseList));
//
//        Store store1 = new Store();
//        store1.fileReader();


//        LinkedList<CustomerPurchasePriorityDTO> prior = store.getAttendanceListBasedOnArrival();
        CustomerPurchasePriorityDTO cust1 = new CustomerPurchasePriorityDTO("Dave","Sausage",23);
        CustomerPurchasePriorityDTO cust2 = new CustomerPurchasePriorityDTO("Ade","Bread",3);
//        CustomerPurchasePriorityDTO cust3 = new CustomerPurchasePriorityDTO("Musa","bread",7);
        CustomerPurchasePriorityDTO cust4 = new CustomerPurchasePriorityDTO("Ike","Sausage",43);
//        CustomerPurchasePriorityDTO cust5 = new CustomerPurchasePriorityDTO("Mike","milk",50);

        PriorityQueueImpl prior = new PriorityQueueImpl();
//        System.out.println(listOfCustomer);
        prior.additionToQueueAndPrioritize(store,cust1);
        prior.additionToQueueAndPrioritize(store,cust2);
        prior.additionToQueueAndPrioritize(store,cust4);
//        prior.additionToQueueAndPrioritize(store,cust3);
//        prior.additionToQueueAndPrioritize(store,cust5);
//        System.out.println(store.getAttendanceListBasedOnArrival());

        System.out.println(cashier.sellItemsAndIssueReceiptBaseOnPriority(store.getAttendanceListBasedOnArrival(),store));
    }


}
