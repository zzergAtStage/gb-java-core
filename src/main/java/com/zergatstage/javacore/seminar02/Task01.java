package com.zergatstage.javacore.seminar02;

import java.util.Arrays;

public class Task01 {
    public static int getEvens(int[] arr ){
            return (int) Arrays.stream(arr).filter(n -> n % 2 == 0).count();
        }
}
