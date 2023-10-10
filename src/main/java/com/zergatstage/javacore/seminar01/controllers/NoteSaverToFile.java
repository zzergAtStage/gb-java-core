package com.zergatstage.javacore.seminar01.controllers;

import com.zergatstage.javacore.seminar01.model.NoteSaver;
import com.zergatstage.javacore.seminar01.model.SomeNote;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class NoteSaverToFile implements NoteSaver {
    /**
     * saves the note entity to file
     *
     * @param note note entity
     * @return storing result in string
     */
    @Override
    public String saveNote(SomeNote note) throws IOException {
        String systemMessage;
        FileWriter file = new FileWriter("notes.txt", true);
        try (file) {
            file.write(note.toString());
            systemMessage = "File " + file + " written successfully!";
        } catch (IOException e) {
            System.out.println("Error cause by: " + e.getMessage() + "\n" + Arrays.toString(e.getStackTrace()));
            systemMessage = "An error during saving the file (see console)";
        }



        return systemMessage;
    }
}
