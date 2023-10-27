package com.zergatstage.javacore.lesson03;

 public class SiloModule{
        enum StateOfPower{
            ENABLED(5),OFF(0.2),SLEEP(2.5);
            private final double voltage;
            //constructor
            StateOfPower(double voltage){
                this.voltage = voltage;
            }
            public double getVoltage(){
                return this.voltage;
            }

        }
}
