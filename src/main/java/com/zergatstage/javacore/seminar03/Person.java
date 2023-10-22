package com.zergatstage.javacore.seminar03;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data // + @RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private int salary;

    public Person(int age) {
        this.age = age;
    }

    /**
     * Сравнивает объекты по возрасту
     * Позволяет сортировать в листе
     * @param o the object to be compared.
     * @return Результат сравнения: положительный - левый старше, отрицательный - левый младше
     * 0 - равны
     */
    @Override
    public int compareTo(Person o) {
        return this.getAge() - o.getAge();
    }

    public int compareByAgeShift(int dd, int mm, int yyyy){
        //as bitwise
        int emplAge = dd + (mm<<6) + (yyyy<<11);
        int compAge = 1;
        return compAge - emplAge;
    }

}
