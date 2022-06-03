package org.example.serviceInterfaces;

import org.example.dto.CustomerPurchasePriorityDTO;
import org.example.model.Store;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Objects;

public class PriorityQueueImpl {

    public LinkedList<CustomerPurchasePriorityDTO> additionToQueueAndPrioritize(Store store, CustomerPurchasePriorityDTO customerPurchasePriorityDTO) {
        LinkedList<CustomerPurchasePriorityDTO> attendanceList = store.getAttendanceListBasedOnArrival();
        if(attendanceList.isEmpty()) {
            attendanceList.add(customerPurchasePriorityDTO);
        }else for(int i = 0; i<attendanceList.size(); i++) {
            attendanceList.add(customerPurchasePriorityDTO);
                if(Objects.equals(customerPurchasePriorityDTO.getProductName(), attendanceList.get(i).getProductName())) {
                    if(customerPurchasePriorityDTO.getQuantity() > attendanceList.get(i).getQuantity()) {
                        Collections.swap(attendanceList,attendanceList.indexOf(attendanceList.get(i)),attendanceList.size()-1);
                    }
                }
                break;
        }
        return attendanceList;
    }
    }
