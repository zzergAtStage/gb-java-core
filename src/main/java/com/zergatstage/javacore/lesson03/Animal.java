package com.zergatstage.javacore.lesson03;

import lombok.Getter;

@Getter
public abstract class Animal {
    private final String name;

    Animal(String name){
        this.name = name;
    }
    public void swim(){
        System.out.printf("Animal %s swims",this.name);
    }
    public void run(){
        System.out.printf("Animal %s runs",this.name);
    }
    public void jump(){
        System.out.printf("Animal %s jumps",this.name);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
