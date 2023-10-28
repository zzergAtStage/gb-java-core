package com.zergatstage.javacore.seminar04;

import com.zergatstage.javacore.seminar04.task01.SecurityManager;
import com.zergatstage.javacore.seminar04.task01.WrongLoginException;
import com.zergatstage.javacore.seminar04.task01.WrongPasswordException;
import com.zergatstage.javacore.seminar04.task02.Customer;
import com.zergatstage.javacore.seminar04.task02.Item;
import com.zergatstage.javacore.seminar04.task02.Order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
       // task01();



            task02();



    }

    private static void task02(){
        //task02

        //create and fill customers
        List<Customer> customers = new ArrayList<>();
        customers.add(Customer.addCustomerToDataLake(new Customer("John")));
        customers.add(Customer.addCustomerToDataLake(new Customer("Evan")));
        customers.add(Customer.addCustomerToDataLake(new Customer("Josh")));
        //new customer is not in the DWH
        customers.add(new Customer("Puppy"));

        //create and fill the goods
        List<Item> goods = new ArrayList<>();
        goods.add(new Item(1,"Salt"));
        goods.add(new Item(2,"Milk"));
        goods.add(new Item(3,"Meat"));

        //items in the cart
        List<Integer> goodsInCart = new ArrayList<>();
        goodsInCart.add(1);
        goodsInCart.add(1);
        goodsInCart.add(3);

        List<Order> orders = new ArrayList<>();

        for (int i = 0; i < customers.size()  ; i++) {
            try{
                orders.add(Order.makeOrder(customers.get(i).getCustomerId(),goodsInCart));
            }catch (Customer.NoClientFoundException e){
                System.out.println(e.getUserMessage() + "\nOrder didn't created!\n" + Arrays.toString(e.getStackTrace()));
            }
        }
        System.out.println(orders);
    }

    private static void task01() {
        //process login
        //case when pass not the same
        String login = "01234567890987654321";
        String password = "01234567890987624321";
        String confirmPassword = "01234567890987654321";
        String userMessage = "Ok";

        boolean result = false;
        try {
            result = SecurityManager.checkPassword(login,password,confirmPassword);
        } catch (WrongLoginException e) {
            userMessage = e.getSystemMessage();
            throw new RuntimeException();
        } catch (WrongPasswordException e) {
            userMessage = e.getUserMessage();
            throw new RuntimeException(e);
        } finally {
            System.out.printf("Login result: %s.%nMessage: %s",result,userMessage);
        }
    }

}
