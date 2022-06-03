package org.example.serviceInterfaces;

import org.example.model.Applicant;
import org.example.model.Product;
import org.example.model.Store;

public interface ManagerService {
   void hire(Applicant applicant);
   String fillStore(Product product, Store store);
}
