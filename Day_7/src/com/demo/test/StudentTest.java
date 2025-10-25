package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Student;
import com.demo.service.StudentService;
import com.demo.service.StudentServiceImpl;

public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        StudentService sser = new StudentServiceImpl();

        sser.readFile("studentData.txt");

        do {
            System.out.println("1. Add new student\n2. Calculate grades\n3. Display all");
            System.out.println("4. Save data in file\n5. Display students sorted by attendance\n6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    boolean status = sser.addNewStudent();

                    if (status) {
                        System.out.println("Added successfully");
                    } else {
                        System.out.println("Not added...");
                    }
                }

                case 2 -> {
                    sser.calculateGrade();
                }

                case 3 -> {
                    List<Student> s = sser.displayAll();

                    s.forEach(System.out::println);
                }

                case 4 -> {
                    sser.writeFile("studentData.txt");
                    System.out.println("File updated succesfully...");
                }

                case 5 -> {
                    List<Student> s = sser.sortByAttendance();
                    s.forEach(System.out::println);
                }

                case 6 -> {
                    System.out.println("Thsnk you...");
                    sc.close();
                }
            }
        } while (choice != 6);
    }
}
