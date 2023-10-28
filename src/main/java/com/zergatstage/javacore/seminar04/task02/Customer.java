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
    private static HashMap<Integer,Customer> customers = new HashMap<>();
    public Customer(String customerDescription){
        ++customerCounter;
        this.customerId = customerCounter;
        this.customerDescription = customerDescription;

    }

    static boolean clientExists(int customerId) {
        return customers.containsKey(customerId);
    }

    public static Customer addCustomerToDataLake(Customer customer){
        customers.put(customer.getCustomerId(), customer);
        return  customer;
    }
    @Getter public static class NoClientFoundException extends Throwable{
        private final String userMessage;
        NoClientFoundException(int clientId){
            this.userMessage = "There is no client with Id = " + clientId;
        }
    }
}
