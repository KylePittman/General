
package com.pitstop.school.programming.assignment.two;

//${PROJECT_NAME} Created by Kyle on 10/7/2014.
public class Employer {
    public static void main(String[] args) {
        Employee Susan = new Employee();
        Employee Bob = new Employee("Bob", 1.00);
        Susan.setName("Susan");
        Bob.raiseSalary(5);
        System.out.println(Susan.getName());
        System.out.println(Susan.getSalary());
        System.out.println(Bob.getName());
        System.out.println(Bob.getSalary());
    }
}
