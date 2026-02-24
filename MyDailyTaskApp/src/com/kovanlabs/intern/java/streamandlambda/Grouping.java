package com.kovanlabs.intern.java.streamandlambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {
    public static void main(String[] args){
        List<Employee> employees = Arrays.asList(
                new Employee("Vignesh", "IT", 50000),
                new Employee("Astin", "HR", 45000),
                new Employee("Ajish","IT",35000),
                new Employee("Shiju","R&D",25000)

        );

        Map<String, List<Employee>> grouped = employees
                .stream()
                .collect(Collectors.groupingBy(e->e.getDepartment()));

        for(Map.Entry<String, List<Employee>> entry: grouped.entrySet()){
            System.out.println(entry.getKey()+"-> "+entry.getValue().toString());
        }

    }
}
