package com.company;
/* Create a class Fractions. Create an equivalent four function calculator for Fractions. When it finishes
calculation, the program should ask whether the user wants to do another calculation. The response can
be ‘y’ or ‘n’.
Addition: a/b + c/d = (a*d + b*c) / (b*d)
Subtraction: a/b - c/d = (a*d - b*c) / (b*d)
Multiplication: a/b * c/d = (a*c) / (b*d)
Division: a/b + c/d = (a*d) / (b*c) */

import java.util.Scanner;

class Fractions{
    private float a, b, c, d;
    private char operator;
    private char another;
    public void inputValue(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, operator, c, d values: ");
        a = input.nextInt();
        b = input.nextInt();
        operator = input.next().charAt(0);
        c = input.nextInt();
        d = input.nextInt();
    }
    public void calculation(){
        switch (operator){
            case '/':
                System.out.println("Division: a/b + c/d = (a*d) / (b*c)");
                System.out.println("Division: " + ((a*d) / (b*c)) );
                break;
            case 'x':
                System.out.println("Multiplication: a/b * c/d = (a*c) / (b*d)");
                System.out.println("Multiplication: " + ((a*c) / (b*d)) );
                break;
            case '+':
                System.out.println("Addition: a/b + c/d = (a*d + b*c) / (b*d)");
                System.out.println("Addition: " + ((a*d + b*c) / (b*d)) );
                break;
            case '-':
                System.out.println("Substraction: a/b - c/d = (a*d - b*c) / (b*d)");
                System.out.println("Substraction: " + ((a*d - b*c) / (b*d)) );
                break;
            default:
                System.out.println("Sorry you have to select operator from : /, x, +, - ");
        }
    }
    public void continueCalulation(){
        Scanner input = new Scanner(System.in);
        System.out.println("Do another (y/n)? ");
        another = input.next().charAt(0);
        if (another == 'y'){
            inputValue();
            calculation();
            continueCalulation();
           }
        }
    }
public class question4 {
    public static void main(String[] args) {
        Fractions obj1 = new Fractions();
        obj1.inputValue();
        obj1.calculation();
        obj1.continueCalulation();
    }
}
