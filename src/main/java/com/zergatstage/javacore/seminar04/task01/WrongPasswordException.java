package com.zergatstage.javacore.seminar04.task01;

import lombok.Getter;

@Getter
public class WrongPasswordException extends Throwable {
    private final String userMessage;

    public WrongPasswordException(String message) {
        this.userMessage = message;
    }

    @Override
    public String getMessage() {
        return userMessage;
    }
}
