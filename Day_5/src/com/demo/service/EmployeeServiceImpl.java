package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

    EmployeeDao edao = new EmployeeDaoImpl();

    @Override
    public void readFile(String string) {
        edao.readFile(string);
    }

    @Override
    public List<Employee> displayAll() {
        return edao.displayAll();
    }

    @Override
    public boolean addNewEmployee() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter EmpId : ");
        int empId = sc.nextInt();
        System.out.print("Enter EmpName : ");
        String name = sc.next();

        System.out.print("Do you want to enter role (y/n) : ");
        String choice = sc.next();
        String role = "";

        Employee e = null;

        switch (choice) {
            case "y" -> {
                System.out.print("Enter EmpRole : ");
                role = sc.next();

                e = new Employee(empId, name, role);
            }
            case "n" -> {
                e = new Employee(empId, name);
            }
        }
        // sc.close();
        return edao.save(e);
    }

    @Override
    public boolean removeEmployee(int id) {
        return edao.removeEmp(id);
    }

    @Override
    public Employee searchByName(String name) {
        return edao.findByName(name);
    }

    @Override
    public List<Employee> sortByName() {
        return edao.sortByName();
    }

    @Override
    public void writeFile(String string) {
        edao.writeFile(string);
    }

}
