package com.zergatstage.javacore.seminar04.task01;

import lombok.Getter;

@Getter
public class WrongLoginException extends Throwable {
    private final String systemMessage;
    WrongLoginException(String methodMessage){
        this.systemMessage = "Wrong credentials: " + methodMessage;
    }

}
