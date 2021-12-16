package com.company;

import java.util.Scanner;

/* Create a class Temp. Write a temperature-conversion program that gives the user the option of
converting Fahrenheit to Celsius or vice versa. Then carry out the conversion. Use floating point
numbers:
  Type 1 to convert Fahrenhiet to Celsius,
  2 to convert Celsius to Fahrenheit: 1
  Enter temperature in Fahrenheit: 70
  In Celsius: 21.111111 */
class Temp {
    private float temp ;
    private int choice;
    public float getChoice(){
        System.out.print("Type 1 to convert Fahrenhiet to Celsius, 2 to convert Celsius to Fahrenhiet : ");
        Scanner input = new Scanner(System.in);
        choice = input.nextInt();
        if (choice == 1){
            System.out.print("Enter temperature in Fahrenheit: ");
            temp = input.nextFloat();
        }else if(choice == 2){
            System.out.print("Enter temperature in Celsius: ");
            temp = input.nextFloat();
        }else {
            temp = 0;
        }
        return temp;
    }
    public void showResult(){
        if (choice == 1){
            System.out.println("In Celsius: " + (temp - 32)/1.8f);
        }else if (choice == 2){
            System.out.println("In Fahrenhiet: " + (1.8f*temp + 32));
        }else {
            System.out.println("Sorry, Invalid value added, please add 1 or 2");
            getChoice();
        }
    }
}
public class question2 {
    public static void main(String[] args){
        Temp t = new Temp();
        t.getChoice();
        t.showResult();
    }
}
