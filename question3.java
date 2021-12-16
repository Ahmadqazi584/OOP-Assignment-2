package com.company;
/* Create a class calculator. Create an equivalent four function calculator. When it finishes calculation, the
program should ask whether the user wants to do another calculation. The response can be ‘y’ or ‘n’. */

import java.util.Scanner;

class calculator{
    private float num1;
    private float num2;
    private char opertor;
    private float Answer;
    private char another;
    public void inputValue(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number, operator and second number: ");
        num1 = input.nextInt();
        opertor = input.next().charAt(0);
        num2 = input.nextInt();
    }
    public void calculation(){
        switch (opertor){
            case '/':
                System.out.println("Answer is: " + (num1 / num2));
                break;
            case 'x':
                System.out.println("Answer is: " + (num1 * num2));
                break;
            case '+':
                System.out.println("Answer is: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Answer is: " + (num1 - num2));
                break;
            default:
                System.out.println("Do another (y/n)? " );
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
public class question3 {
    public static void main(String [] args){
        calculator simple = new calculator();
        simple.inputValue();
        simple.calculation();
        simple.continueCalulation();

    }
}
