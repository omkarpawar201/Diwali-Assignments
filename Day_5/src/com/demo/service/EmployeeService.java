package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

    List<Employee> displayAll();

    boolean addNewEmployee();

    boolean removeEmployee(int id);

    Employee searchByName(String name);

    List<Employee> sortByName();

    void readFile(String string);

    void writeFile(String string);

}
