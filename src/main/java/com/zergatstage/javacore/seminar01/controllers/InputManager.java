package com.zergatstage.javacore.seminar01.controllers;

import java.util.Scanner;

public class InputManager {
    /**
     * Get input from user and returns to its consumer
     * @param prompt user prompt
     * @return what user inputs
     * I don't new what does this row
     */

    public String getUserInputFromConsole(String prompt) {
        Scanner scanner = new Scanner(System.in);
        String defaultPrompt = "Input a note:";
        if (prompt.isEmpty()) prompt = defaultPrompt;
        try (scanner) {
            System.out.println(prompt + "\n");
            String userInput;
            do {
                userInput = scanner.nextLine();
            } while (!scanner.hasNextLine());

            return userInput;
        }

    }
}
