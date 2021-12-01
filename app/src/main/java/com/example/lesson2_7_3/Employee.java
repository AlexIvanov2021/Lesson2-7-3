package com.example.lesson2_7_3;

public class Employee {
    private String employeeName;
    private String employeePost;
    private int employeeSalary;

    public Employee(){

    }
    public Employee(String employeeName, String employeePost ,int employeeSalary ){
        this.employeeName = employeeName;
        this.employeePost = employeePost;
        this.employeeSalary = employeeSalary;

    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeePost() {
        return employeePost;
    }

    public void setEmployeePost(String employeePost) {
        this.employeePost = employeePost;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
}


