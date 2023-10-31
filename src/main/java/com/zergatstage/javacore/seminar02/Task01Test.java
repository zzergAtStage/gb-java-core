package com.zergatstage.javacore.seminar02;

import org.junit.Test;

class Task01Test {

    @org.junit.jupiter.api.Test
    void getEvens() {
    }

    @Test
    void getEvents01(){
        Task01 task = new Task01();
        int[] arr = {2, 1, 2, 3, 4};
        int res = task.getEvens(arr);
    }
}