package com.zergatstage.javacore.lesson01.solutions;

/**
 * Class that provides simple addition method
 */
public class Addition {
    /**
     * static variable, deprecated
     */
    static int base;

    /**
     * Method that makes addition to the base
     * @param value incoming value
     * @return result of multiplication
     */

    public static int addition(int value){
        return getBase() + value;
    }

    public static int getBase() {
        return base;
    }
}
