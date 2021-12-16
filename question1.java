package com.company;

import java.util.Scanner;

/* Create a class Multiples. Assume that you want to generate a table of multiples of any given number.
Write a program that allows the user to enter the number and then generates the table, formatting it
into 10 columns and 20 lines. Interaction with the program should look like this (only the first two lines
are shown) */
class Multiples{
    private int tablenumber;
    private int lines;

    public int getTablenum(int tablenumber){
        this.tablenumber = tablenumber;
        return this.tablenumber;
    }
    public int getLines(int lines){
        this.lines = lines;
        return lines;
    }
    public void showTable(){
        for (int i = 1; i <= getLines(lines) * 10; i++) {
            System.out.print(" " + i * getTablenum(tablenumber));
            if (i%10 == 0){
                System.out.println();
            }
        }
    }
}
public class question1 {
    public static void main(String [] args) {
        Multiples obj = new Multiples();
        // input method
        obj.getTablenum(5);
        obj.getLines(20);
        // output method
        obj.showTable();
    }
}
