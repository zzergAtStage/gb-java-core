package com.zergatstage.javacore.seminar01;

import com.zergatstage.javacore.seminar01.controllers.InputManager;
import com.zergatstage.javacore.seminar01.controllers.NoteSaverToFile;
import com.zergatstage.javacore.seminar01.controllers.Presenter;
import com.zergatstage.javacore.seminar01.model.SomeNote;

import java.io.IOException;
import java.util.Date;

public class Application {
    public static void main(String[] args) throws IOException {
        Presenter presenter = new Presenter();
        InputManager input = new InputManager();
        NoteSaverToFile saver = new NoteSaverToFile();
        //prompt user input
        String noteBody = input.getUserInputFromConsole("Set your note:");

        SomeNote note = new SomeNote(noteBody, new Date() );

        // show note
        presenter.showNoteToConsole(note.toString());

        //save note
        String saveMassage = saver.saveNote(note);

        System.out.println(saveMassage);
    }
}
