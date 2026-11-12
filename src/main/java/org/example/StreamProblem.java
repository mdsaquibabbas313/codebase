package org.example;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
Problem Statement
Given a list of employee objects, write a Java 8 Stream query to find the second highest salary in the department.

Assume an Employee class with the following fields:

String name

String department

double salary
 */
class Employee {
    String name;
    String department;
    double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}
public class StreamProblem {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Aarav", "IT", 75000),
                new Employee("Vivaan", "IT", 90000),
                new Employee("Aditya", "IT", 90000),
                new Employee("Diya", "HR", 60000),
                new Employee("Ananya", "HR", 65000),
                new Employee("Kabir", "HR", 55000)
        );

        // TODO: Write your Java 8 Stream query here
        Map<String, Double> collect = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.collectingAndThen(Collectors.mapping(Employee::getSalary, Collectors.toList()),
                                emp -> emp.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().orElse(-1.0))
                ));

        System.out.println("Department with Second Highest Salary" + collect);

        /*
        Collectors.groupingBy(Employee::getDepartment, ...): Groups all employees by their department name.

        Collectors.collectingAndThen(arg1, arg2): This collector takes the result of a downstream collector (arg1) and runs a final transformation function (arg2) on it.

        What the second argument is asking:
        Right now, your first argument needs to be a proper collector that gathers the salaries into a list (using Collectors.mapping(Employee::getSalary, Collectors.toList())).

        The second argument is a lambda function (like salariesList -> { ... }) that receives that List<Double> for that specific department. Inside that lambda, it expects you to stream that list and apply your sorting, distinct, and skipping logic to return the final result.
         */


    }
}