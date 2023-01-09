package com.progress.learning.intermediate.Chapter9;
import java.util.Random;
class Employees {
    private String employeeName;
    private int employeeID;
    private float baseSalary;

    public Employees() {
        employeeName = "Jonny Bravo";
        employeeID = 0;
        baseSalary = 20000;
    }

    public Employees(int employeeID){
        employeeName = "Jonny Bravo";
        this.employeeID = employeeID;
        baseSalary = 20000;
    }
    public Employees(String employeeName) {
        this.employeeName = employeeName;
        baseSalary = 20000;
    }
    public Employees(int employeeID, String employeeName) {
        this.employeeID  = employeeID;
        this.employeeName = employeeName;
    }
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public float getBaseSalary() {
        return baseSalary;
    }
}

public class Constructors {
    public static void main(String[] args) {
        Random integerGenerator = new Random();
        int getRandomInt = integerGenerator.nextInt(1, 10000);
        Employees employees = new Employees(getRandomInt, "Anshu Naagar");
        System.out.println("Employee ID : " + employees.getEmployeeID());
        System.out.println("Employee Name : " + employees.getEmployeeName());
    }
}