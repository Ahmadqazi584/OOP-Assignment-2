package com.company;
/* Create a class called tollbooth. The two data items are unsigned int to hold the total number of cars, and
a type double to hold the total amount of money collected. A constructor initializes both of these to 0. A
member function called payingCar() increments the car total and adds 0.50 to the cash total. Another
functions called noPayCar(), increments the car total but adds nothing to the cash total. Finally, a
member function called display() displays the two totals. Make appropriate member functions.
The program should allow the user to push one key to count a paying car, and another to count a nonpaying car. Pushing the Esc key should
cause the program to print out the total cars and total cash and then exit. */

import java.net.Socket;
import java.util.Scanner;

class tollbooth {
    private int total_cars;
    private double total_amount;
    private int total_paying_cars;
    private double total_amount_paying_car;
    private int total_nopaying_cars;
    private double total_amount_nopaying_car;
    private double final_amount;
    // method for value initialization
    public tollbooth(){
        final_amount = 0;
        total_amount_paying_car = 0;
        total_amount_nopaying_car = 0;
    }
    // method of paying car and their calculation
    public double payingCar(){
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter total paying car: ");
        total_paying_cars = input1.nextInt();
        for (int i = 0; i < total_paying_cars; i++) {
            System.out.print("enter the amount of car " + (i+1) + ": ");
            final_amount = final_amount + input1.nextInt();
        }
        total_amount_paying_car = final_amount + 0.5;
         return total_amount_paying_car;
    }
    // method of non-paying car and their calculation
    public double nopayingCar() {
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter total no paying car: ");
        total_nopaying_cars = input2.nextInt();
        for (int i = 0; i < total_nopaying_cars; i++) {
            System.out.print("enter the amount of car " + (i+1) + ": ");
            total_amount_nopaying_car = total_amount_nopaying_car + input2.nextInt();
        }
        return total_amount_nopaying_car;
    }
    public void display(){
        System.out.println("The total amount of cars: " + (total_amount_paying_car + total_amount_nopaying_car));
        System.out.println("The total number of cars: " + (total_nopaying_cars + total_paying_cars));
    }
}

// main class with main method
public class question7 {
    public static void main(String [] args){
        tollbooth t = new tollbooth();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("enter any character 1: ");
            if (input.next().charAt(0) != 'e'){
                t.payingCar();
            }
            System.out.print("enter any character 2: ");
            if (input.next().charAt(0) != 'e'){
                t.nopayingCar();
            }
            System.out.println("enter esc by e to display resuts: ");
            if(input.next().charAt(0) == 'e'){
                t.display();
            }
        }

    }
}
