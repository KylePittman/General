package com.pitstop.school.programming.assignment.two;

//${PROJECT_NAME} Created by Kyle on 10/7/2014.
public class Employee {
    private String name;
    private double salary;
    public Employee(String newName, double newSalary) {
        name = newName;
        salary = newSalary;
    }

    public Employee() {
        name = "Susan";
        salary = .80;
    }


    public void setSalary(double newSalary) {
        salary = newSalary;
    }

    public void raiseSalary(double raise){
        salary = salary*(1+raise/100);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String newName) {
        this.name = newName;
    }
}
