package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

    List<Employee> displayAll();

    boolean save(Employee e);

    boolean removeEmp(int id);

    Employee findByName(String name);

    List<Employee> sortByName();

    void readFile(String string);

    void writeFile(String string);

}
