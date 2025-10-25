package com.demo.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Student;

public class StudentDaoImpl implements StudentDao {
    static List<Student> sarr;
    static {
        sarr = new ArrayList<>();
        // rollno, sname, course, attendance_percentage, score
        // sarr.add(new Student(1, "abc", "math", 75, 95));
        // sarr.add(new Student(2, "qbc", "marathi", 65, 75));
        // sarr.add(new Student(3, "gbc", "hindi", 85, 70));
        // sarr.add(new Student(4, "kbc", "english", 55, 85));
        // sarr.add(new Student(5, "cbc", "english", 90, 90));
    }

    @Override
    public List<Student> displayAll() {
        return sarr;
    }

    @Override
    public boolean addStudent(Student s) {
        return sarr.add(s);
    }

    @Override
    public void readFile(String string) {
        File fs = new File(string);

        if (fs.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fs));) {
                while (true) {
                    Student s = (Student) ois.readObject();
                    sarr.add(s);
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }

    @Override
    public void writeFile(String string) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(string));) {
            for (Student s : sarr) {
                oos.writeObject(s);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
