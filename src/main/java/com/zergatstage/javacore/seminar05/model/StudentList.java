package com.zergatstage.javacore.seminar05.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import com.zergatstage.javacore.seminar05.model.Student;

import java.util.List;
import com.zergatstage.javacore.seminar05.model.Student;
@AllArgsConstructor
@Getter
@Builder
public class StudentList<Student> {
    private List<Student> students;

    public void addStudent(Student student){
        students.add(student);
    }
    public List<Student> getStudents(){
        return this.students;
    }
}
