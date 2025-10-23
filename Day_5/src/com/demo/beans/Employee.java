package com.demo.beans;

import java.io.Serializable;

public class Employee implements Serializable {
    private int empId;
    private String empName;
    private String empRole;

    public Employee() {
    }

    public Employee(int empId, String empName, String empRole) {
        this.empId = empId;
        this.empName = empName;
        this.empRole = empRole;
    }

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
        this.empRole = "Trainee";
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpRole() {
        return empRole;
    }

    public void setEmpRole(String empRole) {
        this.empRole = empRole;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", empRole=" + empRole + "]";
    }

}
