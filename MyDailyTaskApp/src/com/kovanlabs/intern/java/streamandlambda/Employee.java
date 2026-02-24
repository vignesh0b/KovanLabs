package com.kovanlabs.intern.java.streamandlambda;

public class Employee {
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "{name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +'}';
    }
}
