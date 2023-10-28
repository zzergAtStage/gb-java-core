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




    public static Order makeOrder(int customerId, List<Integer> goodsInCart ) throws Customer.NoClientFoundException {
        //call checks
        if (!Customer.clientExists(customerId)) throw new Customer.NoClientFoundException(customerId);
        return new Order( ++orderCounter, customerId, goodsInCart);
    }

}
