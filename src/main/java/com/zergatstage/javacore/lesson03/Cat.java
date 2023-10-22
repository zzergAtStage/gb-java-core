package com.zergatstage.javacore.lesson03;

import lombok.Getter;
@Getter
public class Cat extends Animal{
    private static int counter;
    private final int number;

    Cat(String name){
        super(name);
        this.number = ++counter;
    }
    @Override
    public String toString() {
        return "Cat{" +
                "number=" + number +
                "} " + super.toString();
    }
}
