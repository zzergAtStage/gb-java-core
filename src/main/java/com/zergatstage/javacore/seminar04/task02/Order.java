package com.zergatstage.javacore.seminar04.task02;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@AllArgsConstructor
@ToString
public class Order {
    private static int  orderCounter;
    private int orderId;
    private int customerId;
    private List<Integer> itemsInChart;


    /**
     * Main method to create orger with client id, cart, and goods
     * @param customerId Client ID
     * @param goodsInCart Cart
     * @param customers List of customers
     * @return new order
     * @throws Customer.NoClientFoundException
     */
    public static Order makeOrder(int customerId, List<Integer> goodsInCart , CustomerDataManager customers) throws Customer.NoClientFoundException {
        //call checks
        if (!(customers.isCustomerExists(customerId))) throw new Customer.NoClientFoundException(customerId);
        goodsInCart.stream()
                .peek(item -> {
                    if (!goodsInCart.contains(item)) {
                        throw new Item.NoItemsOnStoreAvailableException(2);
                    }
                });
        return new Order( ++orderCounter, customerId, goodsInCart);
    }

}
