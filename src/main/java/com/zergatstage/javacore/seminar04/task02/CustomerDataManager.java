package com.zergatstage.javacore.seminar04.task02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.function.Consumer;

public class CustomerDataManager implements Iterable<Customer>{
    private HashMap<Integer, Customer> customerDataMap;

    public CustomerDataManager(){
        this.customerDataMap = new HashMap<>();
    }
    public void addCustomerData(int key, Customer customer){
        customerDataMap.put(key,customer);
    }

    public Customer getCustomerData(int key) {
        if (!customerDataMap.containsKey(key)) throw new Customer.NoClientFoundException(key);
        return customerDataMap.get(key);
    }

    public void removeCustomerData(int key){
        customerDataMap.remove(key);
    }

    public boolean isCustomerExists(int key){
        return customerDataMap.containsKey(key);
    }

    @Override
    public Iterator<Customer> iterator() {
        return customerDataMap.values().iterator();
    }

    @Override
    public void forEach(Consumer<? super Customer> action) {
        Iterable.super.forEach(action);
    }
}
