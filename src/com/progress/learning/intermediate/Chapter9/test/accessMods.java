package com.progress.learning.intermediate.Chapter9.test;
import java.util.Random;
import java.util.Scanner;

class employees{
    static String name;
    static int employeeID;
    static int salaryAssigned;
    static boolean applicationStatus;
    private static float requiredCGP = 6.0f;
    public static void setName(String getName) {
        name = getName;
    }
    public static String returnName() {
        return name;
    }

    public static void setEmployeeID(int getEmployeeID) {
        employeeID = getEmployeeID;
    }

    public static int getEmployeeID() {
        return employeeID;
    }

    public static void setSalaryAssigned(int salaryAssigned) {
        employees.salaryAssigned = salaryAssigned;
    }

    public static int getSalaryAssigned() {
        return salaryAssigned;
    }

    public static void setApplicationStatus(boolean isApplication) {
        applicationStatus = isApplication;
    }

    public static void setRequiredCGP(float applicantCGP) {
        requiredCGP = applicantCGP;
    }

    public static String getRequiredCGP() {
        if (requiredCGP > 9.0f) {
            return "Congrats! You Joined";
        } else if (requiredCGP == 0.0f){
            while (true){
                Scanner getDetails = new Scanner(System.in);
                System.out.print("Enter CGP Properly : ");
                float enterCGP = getDetails.nextFloat();
            }
        } else{
            return "Not Applicable";
        }
    }

    public static String isApplicationStatus() {
        if (applicationStatus) {
            return "Confirmed";
        }  else if (requiredCGP < 6.0f) {
            return "Not applicable!";
        }else{
            return "Pending...!";
        }
    }
}

public class accessMods {
    public static void setData() {
        Scanner getDetails = new Scanner(System.in);
        Random getRandom = new Random();
        int randomSalary = getRandom.nextInt(1, 200000);
        System.out.print("Enter Name : ");
        String nameGet = getDetails.nextLine();
        System.out.print("Enter your CGP : ");
        float enterCGP = getDetails.nextFloat();
        boolean applicationStatus = getRandom.nextBoolean();
        int setID = getRandom.nextInt(1, 15000);
        employees.setName(nameGet);
        employees.setSalaryAssigned(randomSalary);
        employees.setEmployeeID(setID);
        employees.setRequiredCGP(enterCGP);
        employees.setApplicationStatus(applicationStatus);
    }
    public static void returnData(){
        System.out.println("=================== REPORT ===================");
        System.out.println("Name : " + employees.returnName());
        System.out.println("Employee ID : " + employees.getEmployeeID());
        System.out.println("Salary : " + employees.getSalaryAssigned());
        System.out.println("Application status : " + employees.isApplicationStatus());
        System.out.println("Applicable ? : " + employees.getRequiredCGP() );
    }

    public static void main(String[] args) {
        setData();
        returnData();
    }
}
