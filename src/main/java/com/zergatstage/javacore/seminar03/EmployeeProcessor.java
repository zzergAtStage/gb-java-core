package com.zergatstage.javacore.seminar03;

import java.util.List;

public class EmployeeProcessor {

    public static void increaseSalary(List<Person> staff) {
        for (Person employee : staff) {
            int salary = employee.getSalary();
            if (employee.getAge() > 45) employee.setSalary((int) (salary * 1.25));
        }
    }

    public static void increaseSalary(List<Person> staff, int ageToIncrease, int promoteValue) {
        for (Person employee : staff) {
            int salary = employee.getSalary();
            if (employee.getAge() > ageToIncrease) employee.setSalary((int) (salary + promoteValue));
        }
    }
}
