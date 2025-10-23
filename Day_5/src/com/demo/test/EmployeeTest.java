package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        EmployeeService eser = new EmployeeServiceImpl();

        eser.readFile("empdata.txt");

        do {
            System.out.println("1. Add Employee to list\n2. Remove Employee from list");
            System.out.println("3. Show all Employee\n4. Show all Employee in sorted order");
            System.out.println("5. Find a Employee with empName\n6. Save all Employees into file\n7. Quit");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    boolean status = eser.addNewEmployee();

                    if (status) {
                        System.out.println("Added succesfully");
                    } else {
                        System.out.println("Error....");
                    }
                }

                case 2 -> {
                    System.out.print("Enter EmpID to delete : ");
                    int id = sc.nextInt();

                    boolean status = eser.removeEmployee(id);

                    if (status) {
                        System.out.println("Removed succesfully");
                    } else {
                        System.out.println("Error....");
                    }
                }

                case 3 -> {
                    List<Employee> e = eser.displayAll();
                    e.forEach(System.out::println);
                }

                case 4 -> {
                    List<Employee> e = eser.sortByName();
                    e.forEach(System.out::println);
                }

                case 5 -> {
                    System.out.print("Enter name to search : ");
                    String name = sc.next();

                    Employee e = eser.searchByName(name);

                    if (e != null) {
                        System.out.println(e);
                    } else {
                        System.out.println("Not Found");
                    }
                }

                case 6 -> {
                    eser.writeFile("empdata.txt");
                    System.out.println("File updated succesfully...");
                }

                case 7 -> {
                    sc.close();
                    System.out.println("Thank you ...");
                }
            }
        } while (choice != 7);

        sc.close();
    }
}
