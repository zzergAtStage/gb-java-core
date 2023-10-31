package com.zergatstage.javacore.seminar04.task01;

public class SecurityManager {
    public static boolean checkPassword(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        //check login length
        if (login.length() < 20) throw new WrongLoginException("Login length is too short");

        //check password length
        if ((password.length() < 20) ) {
            throw new WrongPasswordException("Password length is too short\t");
        } else if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password and confirmation password aren't the same\t");
        }
        return false;
    }
}
