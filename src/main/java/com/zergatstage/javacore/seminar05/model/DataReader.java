package com.zergatstage.javacore.seminar05.model;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface DataReader {
    public List<Student> readStudents(String url) throws IOException;
}
