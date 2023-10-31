package com.zergatstage.javacore.seminar04.task02;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter

public class Customer {
    private static int customerCounter;
    private int customerId;
    String customerDescription;
    public Customer(String customerDescription){
        ++customerCounter;
        this.customerId = customerCounter;
        this.customerDescription = customerDescription;
    }

    public static boolean doesCustomerExists(CustomerDataManager customers, int key){
       return customers.isCustomerExists(key);

    }
    @Getter public static class NoClientFoundException extends RuntimeException{
        private final String userMessage;
        NoClientFoundException(int clientId){
            this.userMessage = "There is no client with Id = " + clientId;
        }
    }
}
