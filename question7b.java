package com.company;
/* Create a class called Student. It will contain member functions that will read and print student’s detail
using atleast 8 of the student’s attributes for example: his/her ID, First name, Last Name, Contact, City,
DOB, Current Semester, No. of courses enrolled etc.
The program should allow the user to enter his/her details and print them accordingly */

import java.util.Scanner;

class Student{
    private int id;
    private String first_name;
    private String last_name;
    private long contact;
    private String city;
    private String DOB;
    private byte current_semester;
    private byte courses_enrolled;

    public void setData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your student id: ");
        id = input.nextInt();
        System.out.print("Enter your first name: ");
        first_name = input.next();
        System.out.print("Enter your last name: ");
        last_name = input.next();
        System.out.print("Enter your contact number: ");
        contact = input.nextLong();
        System.out.print("Enter your city: ");
        city = input.next();
        System.out.print("Enter your Date of Birth (mm-dd-yyyy): ");
        DOB = input.next();
        System.out.print("Enter your current semester: ");
        current_semester = input.nextByte();
        System.out.print("Enter your courses you have enrolled: ");
        courses_enrolled = input.nextByte();
    }
    public void getData(){
        System.out.println("==========================================");
        System.out.println("ID: \t\t" + id);
        System.out.println("First name: \t" + first_name);
        System.out.println("Last name: \t" + last_name);
        System.out.println("Contact: \t" + contact);
        System.out.println("City: \t" + city);
        System.out.println("DOB(mm-dd-yyy): \t" + DOB);
        System.out.println("Current semester: " + current_semester);
        System.out.println("Courses you have enrolled: " + courses_enrolled);
        System.out.println("==========================================");

    }
}
public class question7b {
    public static void main (String[] args){
        Student obj = new Student();
        obj.setData();
        obj.getData();
    }
}
