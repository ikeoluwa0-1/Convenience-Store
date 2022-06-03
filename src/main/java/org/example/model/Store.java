package org.example.model;

import org.example.dto.CustomerPurchasePriorityDTO;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Store {

    private List<Product> productStore = new ArrayList<>();

    private LinkedList<CustomerPurchasePriorityDTO> attendanceListBasedOnArrival = new LinkedList<>();


    public List<Product> getProductStore() {
        return productStore;
    }


    public void setProductStore(List<Product> productStore) {
        this.productStore = productStore;
    }

    public LinkedList<CustomerPurchasePriorityDTO> getAttendanceListBasedOnArrival() {
        return attendanceListBasedOnArrival;
    }

    public void setAttendanceListBasedOnArrival(LinkedList<CustomerPurchasePriorityDTO> attendanceListBasedOnArrival) {
        this.attendanceListBasedOnArrival = attendanceListBasedOnArrival;
    }

    @Override
    public String toString() {
        return "Store{" +
                "productStore=" + productStore +
                ", attendanceListBasedOnArrival=" + attendanceListBasedOnArrival +
                '}';
    }

    public List<Product> fileReader() throws IOException {

        Scanner scanner = new Scanner(new File("/Users/user/IdeaProjects/ConvenienceSTORE/src/main/resources/Book 1.csv"));
        String [] tem;
        boolean first = true;
        String line = null;
        while (scanner.hasNext()) {
            line = scanner.nextLine();
            tem = line.split(",");

            if (first) {
                first = false;
                continue;
            }
            Product product = new Product();
            product.setProductId(tem[0]);
            product.setProductName(tem[1]);
            product.setPriceTag(Double.parseDouble(tem[2]));
            product.setCompartment(tem[3]);
            product.setQuantity(Integer.parseInt(tem[4]));
            this.productStore.add(product);

        }
        scanner.close();
        System.out.println("this the PRODUCT: " + productStore);
        return productStore;
    }

}
