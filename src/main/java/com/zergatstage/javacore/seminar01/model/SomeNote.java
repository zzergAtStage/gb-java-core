package com.zergatstage.javacore.seminar01.model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Notes entity
 */
public class SomeNote {
    /**
     * Note body. Not so much to keep it big
     */
    private String noteBody;
    /**
     * Time of creation
     */
    private Date noteTimeCreation;

    /**
     * Default constructor
     * @param noteBody Note body
     * @param noteTimeCreation date-time of note creation
     */
    public SomeNote(String noteBody, Date noteTimeCreation) {
        this.noteBody = noteBody;
        this.noteTimeCreation = noteTimeCreation;
    }

    public String getNoteBody() {
        return noteBody;
    }

    public void setNoteBody(String noteBody) {
        this.noteBody = noteBody;
    }

    public Date getNoteTimeCreation() {
        return noteTimeCreation;
    }

    public void setNoteTimeCreation(Date noteTimeCreation) {
        this.noteTimeCreation = noteTimeCreation;
    }

    @Override
    public String toString(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        return this.getNoteBody() + "\n" +
                formatter.format(this.getNoteTimeCreation());
    }

}
