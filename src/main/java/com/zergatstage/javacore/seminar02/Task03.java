package com.zergatstage.javacore.seminar02;

public class Task03 {
    public static boolean getNeighbours(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i] == arr[i+1]) && (arr[i] == 0)) return true;
        }
        return false;
    }
}
