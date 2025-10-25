package com.demo.service;

import java.util.List;

import com.demo.beans.Student;

public interface StudentService {

    List<Student> displayAll();

    void calculateGrade();

    boolean addNewStudent();

    void readFile(String string);

    void writeFile(String string);

}
