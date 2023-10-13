package com.zergatstage.javacore.seminar02;

public class Task02 {
    public static int getTheDifference(int[] arr){
        if (arr.length == 0) return 0;
        int min = arr[0], max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i];
            if (max < arr[i]) max = arr[i];
        }
        return max-min;
    }
}
