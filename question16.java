package com.company;

import javax.swing.*;
import java.security.SecureRandom;
import java.util.Calendar;
import java.util.Scanner;
import java.util.logging.SocketHandler;

/* Make a class TranscriptSemester1 and furthermore till the semester you are currently studying in and
provide the Semester GPA of each semester and Commulative GPA of the previous semesters BY overriding
relevant functions and displaying the information */
class TranscriptSemester1{
    private String student_name;
    private String student_id;
    private String father_name;
    private String surname;
    private String current_semester;
    private String department;

    // for theory calculation
    private int tIS, tPS, tCPC, tAC, tCF;
    private int mIS, mPS, mCPC, mAC, mCF;
    private int cIS, cPS, cCPC, cAC, cCF;
    private double qIS, qPS, qCPC, qAC, qCF;
    // for practical calculation
    private int tpCPC, tpCF;
    private int mpCPC, mpCF;
    private int cpCPC, cpCF;
    private double qpCPC, qpCF;


    public TranscriptSemester1(String student_name, String student_id,String surname, String father_name, String current_semester, String department){
        this.student_name = student_name;
        this.student_id = student_id;
        this.surname = surname;
        this.father_name = father_name;
        this.current_semester = current_semester;
        this.department = department;
    }

    public void mainHeading(){
        System.out.println("\t\t\t\t\t\t\t\t======= MEHRAN UNIVERSITY OF ENGINEERING & TECHNOLOGY =======");
        System.out.println("\t\t\t\t\tThe grade obtained by \t " + student_name + "\t S/O \t " + father_name + " \t Surname \t " + surname);
        System.out.println("\t\t\t\t\thaving ID.No.  \t " + student_id + "\t \tin " + current_semester + " \t Semester \t\t " + department);
    }
    public TranscriptSemester1(int tIS, int tPS, int tCPC, int tAC, int tCF, int tpCPC, int tpCF){
        this.tIS = tIS;
        this.tPS = tPS;
        this.tCPC = tCPC;
        this.tAC = tAC;
        this.tCF = tCF;
        this.tpCPC = tpCPC;
        this.tpCF = tpCF;
    }
    public void settheoryMarks(){
        Scanner input1 = new Scanner(System.in);
        System.out.print("enter marks in IS: " );
        mIS = input1.nextInt();
        System.out.print("enter marks in PS: ");
        mPS = input1.nextInt();
        System.out.print("enter marks in CPC: ");
        mCPC = input1.nextInt();
        System.out.print("enter marks in AC: ");
        mAC = input1.nextInt();
        System.out.print("enter marks in CF: ");
        mCF = input1.nextInt();
    }
    public void theorycreditHours(){
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter the credit hours of IS: ");
        cIS = input2.nextInt();
        System.out.print("Enter the credit hours of PS: ");
        cPS = input2.nextInt();
        System.out.print("Enter the credit hours of CPC: ");
        cCPC = input2.nextInt();
        System.out.print("Enter the credit hours of AC: ");
        cAC = input2.nextInt();
        System.out.print("Enter the credit hours of CF: ");
        cCF = input2.nextInt();
    }
    public void theoryqualityPoints(){
        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter the quality points of IS: ");
        qIS = input3.nextDouble();
        System.out.print("Enter the quality points of PS: ");
        qPS = input3.nextDouble();
        System.out.print("Enter the quality points of CPC: ");
        qCPC = input3.nextDouble();
        System.out.print("Enter the quality points of AC: ");
        qAC = input3.nextDouble();
        System.out.print("Enter the quality points of CF: ");
        qCF = input3.nextDouble();
    }
    public void setpracticalMarks(){
        Scanner input4 = new Scanner(System.in);
        System.out.print("Enter the CPC marks obtained in practical: ");
        mpCPC = input4.nextByte();
        System.out.print("Enter the CF marks obtained in practical: ");
        mpCF = input4.nextByte();
    }
    public void practicalcreditHours(){
        Scanner input5 = new Scanner(System.in);
        System.out.print("Enter the Credit hours of CPC Practical: ");
        cpCPC = input5.nextByte();
        System.out.print("Enter the Credit hours of CF Practical: ");
        cpCF = input5.nextByte();
    }
    public void practicalqualityPoints(){
        Scanner input6 = new Scanner(System.in);
        System.out.print("Enter the quality points in CPC Practical: ");
        qpCPC = input6.nextDouble();
        System.out.print("Enter the quality points ib CF Practical: ");
        qpCF = input6.nextDouble();
    }
    public void markSheet(){
        System.out.println("\t\t==============================================================================================================");
        System.out.println("\t\t\t Subject \t\t\t\t\t\t" + " Total Marks \t" + "Marks Obtained\t" + "\tCredit Hours\t" + "Quality Points");
        System.out.println("\t\t==============================================================================================================");
        System.out.println("\t\t\t Islamiyat \t\t\t\t\t\t\t" + tIS + "\t\t\t\t" + mIS + "\t\t\t\t\t" + cIS + "\t\t\t\t" + qIS);
        System.out.println("\t\t--------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t Pakistan Studies \t\t\t\t\t" + tPS + "\t\t\t\t" + mPS + "\t\t\t\t\t" + cPS + "\t\t\t\t" + qPS);
        System.out.println("\t\t--------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t Computer Programming Concepts \t\t" + tCPC + "\t\t\t\t" + mCPC + "\t\t\t\t\t" + cCPC + "\t\t\t\t" + qCPC);
        System.out.println("\t\t\t Practical \t\t\t\t\t\t\t" + tpCPC + "\t\t\t\t" + mpCPC + "\t\t\t\t\t" + cpCPC + "\t\t\t\t" + qpCPC);
        System.out.println("\t\t--------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t Applied Calculus \t\t\t\t\t" + tAC + "\t\t\t\t" + mAC + "\t\t\t\t\t" + cAC + "\t\t\t\t" + qAC);
        System.out.println("\t\t--------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t Computer Fundamentals \t\t\t\t" + tCF + "\t\t\t\t" + mCF + "\t\t\t\t\t" + cCF + "\t\t\t\t" + qCF);
        System.out.println("\t\t\t Practical \t\t\t\t\t\t\t" + mpCF + "\t\t\t\t" + mpCF + "\t\t\t\t\t" + cpCF + "\t\t\t\t" + qpCF);
        System.out.println("\t\t==============================================================================================================");
    }

    public void finalLine(){
        System.out.println("\t\t Total Credit Hours \t " + (cIS + cPS + cAC + cCPC + cCF + cpCPC +cpCF) + "\t Quality Points \t" + (qIS + qPS + qAC + qCPC + qCF + qpCPC + qpCF) + "\t GPA \t " + ((qIS + qPS + qAC + qCPC + qCF + qpCPC + qpCF)/(cIS + cPS + cAC + cCPC + cCF + cpCPC +cpCF)) );
    }
}
public class question16 {
    public static void main(String[] args){
        TranscriptSemester1 tr = new TranscriptSemester1(50, 50, 100, 50, 100, 100,50);
        // Data for theory
        tr.settheoryMarks();
        tr.theorycreditHours();
        tr.theoryqualityPoints();
        // Data for Practical
        tr.setpracticalMarks();
        tr.practicalcreditHours();
        tr.practicalqualityPoints();
        // Sheet Heading
        TranscriptSemester1 trans = new TranscriptSemester1("Mr.Ahmed", "20bscs009","qazi","Ghulam farooq Jan", "first", "Computer Science");
        trans.mainHeading();
        // Sheet data displaying
        tr.markSheet();
        System.out.println();
        System.out.println();
        // Final data in last line
        tr.finalLine();
    }
}
