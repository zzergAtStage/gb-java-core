package com.zergatstage.javacore.lesson01;

import com.zergatstage.javacore.lesson01.solutions.*;

/*** Main class, that does all calls from one call point
 */
public class Application {
    /**
     * Main as one main;
     * @param args standard java call point's parameters;
     */
    public static void main(String[] args) {
        int magicNumber = 2;
        System.out.println("Addition = " + Addition.addition(magicNumber));
        System.out.println("Multiplication = " + Multiplication.multiplication(magicNumber,magicNumber));
        System.out.println("Divination = " + Divination.divination("wrong word!"));
    }
}
