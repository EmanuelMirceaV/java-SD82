package Encapsulation;

public class Employee {

    // Create Employee ID and Salary in the Encapsulation.Employee class
    // Using Encapsulation, give values to Employee ID and Salary in a different class (ExEncaps), then print those new values:
    // Employee Information: Employee ID is and Employee Salary is

    private int employeeId;
    private int salary;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
