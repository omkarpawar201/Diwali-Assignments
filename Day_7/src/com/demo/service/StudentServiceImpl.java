package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Student;
import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;
import com.demo.exceptions.LowAttendance;

public class StudentServiceImpl implements StudentService {

    StudentDao sdao = new StudentDaoImpl();

    @Override
    public List<Student> displayAll() {
        return sdao.displayAll();
    }

    @Override
    public void calculateGrade() {
        for (Student s : sdao.displayAll()) {
            try {
                s.calculateGrade();
            } catch (LowAttendance e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public boolean addNewStudent() {
        Scanner sc = new Scanner(System.in);
        // rollno, sname, course, attendance_percentage, score

        System.out.print("Enter roll no : ");
        int rn = sc.nextInt();
        System.out.print("Enter sname : ");
        String sname = sc.next();
        System.out.print("Enter course : ");
        String course = sc.next();
        System.out.print("Enter attendance percentage : ");
        float att = sc.nextFloat();
        System.out.print("Enter score : ");
        float score = sc.nextFloat();

        Student s = new Student(rn, sname, course, att, score);

        return sdao.addStudent(s);
    }

    @Override
    public void readFile(String string) {
        sdao.readFile(string);
    }

    @Override
    public void writeFile(String string) {
        sdao.writeFile(string);
    }

}
