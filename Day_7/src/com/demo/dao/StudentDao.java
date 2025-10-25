package com.demo.dao;

import java.util.List;

import com.demo.beans.Student;

public interface StudentDao {

    List<Student> displayAll();

    boolean addStudent(Student s);

    void readFile(String string);

    void writeFile(String string);

}
