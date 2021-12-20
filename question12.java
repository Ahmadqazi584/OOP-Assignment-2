package com.company;

import java.util.Scanner;

/* Create a base class with two methods. In the first method, call the second method. Inherit a class and
override the second method. Explain what happens. */
class Base{
    protected int x;
    protected int y;
    private int formula;
    public void sum () {
        formula = 2 * (x + y) * (x-y) ;
        System.out.println("The total answer is: " + formula);
    }
    public void value(){
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter x value: ");
        x = input1.nextInt();
        System.out.print("Enter y value: ");
        y = input1.nextInt();
    }
}
class Derived extends Base{
    @Override
    public void value() {
        x = 15;
        y = 10;
    }
}
public class question12 {
    public static void main(String[] args){
        Base obj1 = new Base();
        obj1.value();
        obj1.sum();

        Base obj2 = new Derived();
        obj2.value();
        obj2.sum();
    }
}
