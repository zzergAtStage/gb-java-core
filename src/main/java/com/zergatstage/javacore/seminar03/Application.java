package com.zergatstage.javacore.seminar03;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Person> staff = new ArrayList<>(5);
        staff.add(new Person("Josh",33, 25000));
        staff.add(new Person("Abram",54, 36000));
        staff.add(new Person("Luck",33, 18000));
        staff.add(new Person("Amber",45, 27000));
        staff.add(new Person("Bonny",27, 55000));


        System.out.println(staff);
        EmployeeProcessor.increaseSalary(staff);
        System.out.println(staff);
        EmployeeProcessor.increaseSalary(staff,32, 999);
        System.out.println(staff);

    }
}
