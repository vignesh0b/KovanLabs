package com.kovanlabs.intern.java.oop;

public class ImmutableClass {
    public static void main(String[] args){
        Employee employee1 = new Employee(1, "Ganesh", "Software developer");
        Employee employee2 = new Employee(2, "rahul", "Software tester");
        Employee employee3 = new Employee(3, "kumar", "Devops Engineer");

        System.out.println(employee1.getId()+" " +employee1.getName()+" "+employee1.getRole());
        System.out.println(employee2.getId()+" " +employee2.getName()+" "+employee2.getRole());
        System.out.println(employee3.getId()+" " +employee3.getName()+" "+employee3.getRole());
    }
}
class Employee{
    private final int id;
    private final String name;
    private final String role;

    Employee(int id, String name, String role){
        this.id=id;
        this.name=name;
        this.role=role;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }
}

