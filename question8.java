package com.company;

import java.util.Scanner;

/* Write a program to read time in seconds and convert in time format (HH:MM:SS) using classes and objects.
The class must contain appropriate member functions and member variables. The program should allow the user to enter seconds and print them in HH:MM:SS. */
class Time{
    private int time;
    private int HH, MM, SS;
    private int hours, mintues, second;

    // method for setting the time in seconds
    public int setTime(int time){
        this.time = time;
        return this.time;
    }
    // methods contain calculation to convert seeconds to Hours, mintues & seconds
    public void calculation(){
        HH = setTime(time) / 3600;
        hours = setTime(time) % 3600;
        MM = hours / 60;
        mintues = HH % 60;
        SS = MM % 60;
    }
    // method to display the calculated result of output
    public void displayResult(){
        if (HH < 10){
            System.out.print("0" + HH + " : ");
        }else {
            System.out.print(HH + " : ");
        }
        if (MM < 10){
            System.out.print("0" + MM + " : ");
        }else{
            System.out.print(MM + " : ");
        }
        if (SS < 10){
            System.out.print("0" + SS);
        }else {
            System.out.print(SS);
        }
    }
}
public class question8 {
    public static void main(String[] args){
        // the object of Time class with methods calling
        Time t = new Time();
        t.setTime(86399);
        t.calculation();
        t.displayResult();
    }
}
