package com.zergatstage.javacore.seminar02.classwork;

import java.util.Arrays;

public class Task02_2 {
    public static void main(String[] args) {
        int[] array = {-1, 2, 3, -4, 5};
        boolean hasTwoPartsWithEqualSum = hasTwoPartsWithEqualSum(array);

        if (hasTwoPartsWithEqualSum) {
            System.out.println("The array has two parts with equal sums.");
        } else {
            System.out.println("The array does not have two parts with equal sums.");
        }
    }

    public static boolean hasTwoPartsWithEqualSum(int[] array) {
        int totalSum = Arrays.stream(array).sum();
        int leftSum = 0;
        for (int j : array) {
            leftSum += j;
            int rightSum = totalSum - leftSum;
            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }


}
