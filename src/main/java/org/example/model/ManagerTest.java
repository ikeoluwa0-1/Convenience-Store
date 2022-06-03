package org.example.model;

import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class ManagerTest {
    @org.junit.jupiter.api.Test
    void main (){
    Manager manager = new Manager();
    manager.hire(new Applicant());

    manager.fillStore(new Product(), new Store());

    assertEquals(fillStore(new Product(), new Store()), fillStore(new Product(), new Store()));


    }


    @Test
    public void hire(Applicant applicant) {
        if ((applicant.getQualification() == QualifiedGrade.FirstClass
        ) && (applicant.getAge() <=27 && applicant.getAge() >= 25)){
            System.out.println("Congratulations " + applicant.getName() + " you have been recruited");
        }else{
            System.out.println("Sorry," + applicant.getName() + " You are not considered for employment");
        }
    }

    @Test
    public String fillStore(Product product, Store store) {
        List<Product> productStore = store.getProductStore();
        productStore.add(product);
        return "Product Successfully Added to Store";
    }

}
