package com.company;

import java.util.Scanner;

/* Create an employee class. The member data should comprise an int for storing the employee number
and a float for storing the employee’s salary. Member functions should allow the user to enter this data
and display it. Write a main() that allows the user to enter data for three employees and display it. */
class employee{
    private int employeeid;
    private float employeesalary;
    public int setID(int employeeid){
        this.employeeid = employeeid;
        return this.employeeid;
    }
    public float setSalary(float employeesalary){
        this.employeesalary = employeesalary;
        return this.employeesalary;
    }
    public void getInfo(){
        System.out.println("Employee Id: " + setID(employeeid));
        System.out.println("Empoyee Salary: " + setSalary(employeesalary));
    }
}
public class question5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        employee [] arr = new employee[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new employee();
            System.out.println("Enter the ID & Salary of employee " + (i+1));
            arr[i].setID(input.nextInt());
            arr[i].setSalary(input.nextInt());
        }
        System.out.println("============================");
        System.out.println(" Result data of Employees ");
        System.out.println("============================");

        for (int i = 0; i < arr.length; i++) {
            arr[i].getInfo();
            System.out.println("------------------------");
        }
    }
}
