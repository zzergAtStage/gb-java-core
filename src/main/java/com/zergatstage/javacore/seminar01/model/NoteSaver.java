package com.zergatstage.javacore.seminar01.model;

import java.io.IOException;

public interface NoteSaver {
    /**
     * saves the note entity to file
     * @param note note entity
     * @return storing result in string
     */
    String saveNote(SomeNote note) throws IOException;
}
