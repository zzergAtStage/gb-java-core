package com.zergatstage.javacore.lesson03;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        Cat cat = new Cat("Jons");
        Animal cat2 = new Cat("Jeremy");

        List<Animal> listCat = new ArrayList<>();
        listCat.add(cat);
        listCat.add(cat2);
        listCat.add(new Cat("Snowy"));

        for (Animal caty : listCat) {
            System.out.printf("Cat %s \t #%d%n", caty.getName(), ((Cat) caty).getNumber());
        }

    }
}
