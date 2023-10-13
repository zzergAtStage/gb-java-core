package com.zergatstage.javacore.seminar02;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        //task01
        int[] arr01 = {2, 1, 2, 3, 4};
        int[] arr02 = {2, 2, 0};
        int[] arr03 = {1, 3, 5};

        System.out.println(Arrays.toString(arr01) +" -> "+ Task01.getEvens(arr01));
        System.out.println(Arrays.toString(arr02) +" -> "+ Task01.getEvens(arr02));
        System.out.println( Arrays.toString(arr03) +" -> "+ Task01.getEvens(arr03));

        //task02
        int[] arr02_1 = {0,125,12,2,4,89};
        System.out.println(Arrays.toString(arr02_1) +" -> "+ Task02.getTheDifference(arr02_1));
        //task03
        int[] arr03_1 = {0,125,12,1,12,0,0,2,4,89};
        System.out.println(Arrays.toString(arr03_1) +" -> "+ Task03.getNeighbours(arr03_1));
    }
}
