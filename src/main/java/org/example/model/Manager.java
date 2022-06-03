package org.example.model;
import org.example.serviceInterfaces.ManagerService;

import java.util.*;


public class Manager extends Person implements ManagerService {
    private String officeLocation;

    public Manager() {
    }

    public Manager(String officeLocation) {
        this.officeLocation = officeLocation;
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "officeLocation='" + officeLocation + '\'' +
                '}';
    }

    @Override
    public void hire(Applicant applicant) {
        if ((applicant.getQualification() == QualifiedGrade.FirstClass
        ) && (applicant.getAge() <=27 && applicant.getAge() >= 25)){
            System.out.println("Congratulations " + applicant.getName() + " you have been recruited");
        }else{
            System.out.println("Sorry," + applicant.getName() + " You are not considered for employment");
        }
    }

    @Override
    public String fillStore(Product product, Store store) {
        List<Product> productStore = store.getProductStore();
        productStore.add(product);
        return "Product Successfully Added to Store";
    }

}

