package com.zergatstage.javacore.seminar05;

import com.zergatstage.javacore.seminar05.model.Student;
import com.zergatstage.javacore.seminar05.model.StudentList;
import com.zergatstage.javacore.seminar05.model.StudentsFileReader;
import lombok.SneakyThrows;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        StudentsFileReader fileReader = new StudentsFileReader();
        final double  passingGrade = 4.5;
        try {
            List<Student> studentList = fileReader.readStudents("resource/students.json");
            List<Student> studentExclusion  = studentList.stream()
                    .filter(student -> student.getAverageGrade() > passingGrade)
                    .sorted((student1, student2) -> Double.compare(student2.getAverageGrade(), student1.getAverageGrade()))
                    .collect(Collectors.toList());

            System.out.println("Good students are: \n " + studentExclusion);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
