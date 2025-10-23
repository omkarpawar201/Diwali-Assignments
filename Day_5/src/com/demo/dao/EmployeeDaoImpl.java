package com.demo.dao;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
    static List<Employee> earr;

    static {
        earr = new ArrayList<>();

        // earr.add(new Employee(101, "abc", "HR"));
        // earr.add(new Employee(102, "xyz", "UI"));
        // earr.add(new Employee(103, "def"));
    }

    @Override
    public void readFile(String data) {
        File fs = new File(data);

        if (fs.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(data));) {
                while (true) {
                    Employee e = (Employee) ois.readObject();
                    earr.add(e);
                }

            } catch (EOFException e) {
                System.out.println("Reached to end of file");

            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    @Override
    public List<Employee> displayAll() {
        return earr;
    }

    @Override
    public boolean save(Employee e) {

        return earr.add(e);
    }

    @Override
    public boolean removeEmp(int id) {

        for (Employee e : earr) {
            if (e.getEmpId() == id) {
                earr.remove(e);
                return true;
            }
        }
        return false;
    }

    @Override
    public Employee findByName(String name) {

        for (Employee e : earr) {
            if (e.getEmpName().equals(name)) {
                return e;
            }
        }
        return null;
    }

    @Override
    public List<Employee> sortByName() {

        Comparator<Employee> c = (o1, o2) -> {
            return o1.getEmpName().compareTo(o2.getEmpName());
        };
        List<Employee> elist = new ArrayList<>();
        for (Employee e : earr) {
            elist.add(e);
        }
        elist.sort(c);
        return elist;
    }

    @Override
    public void writeFile(String string) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(string))) {
            for (Employee e : earr) {
                oos.writeObject(e);
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
