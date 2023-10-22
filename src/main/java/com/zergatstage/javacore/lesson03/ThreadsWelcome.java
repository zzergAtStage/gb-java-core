package com.zergatstage.javacore.lesson03;

/**
 * Demonstrates the Threading in Java & nested classes
 */
public class ThreadsWelcome {
        static final int  LOW_PRIORITY = 10;
        static final int  HIGH_PRIORITY = 1;
        public static void main(String[ ] args) {
            Name name = new Name();
            //set priority
            name.setPriority(HIGH_PRIORITY);

            Welcome welcome = new Welcome();
            welcome.setPriority(HIGH_PRIORITY);
            //set priority

            welcome.start();
            name.start();

        }
    }

    //extend the Thread class
    class Welcome extends Thread{

        public void run() {
            System.out.println("Welcome!");
        }
    }

    //extend the Thread class
    class Name extends Thread {

        public void run() {
            System.out.println("Please enter your name");
        }
    }


