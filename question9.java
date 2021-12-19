package com.company;
/* Raising a number n to a power p is the same as multiplying n by itself p times. Write as overloaded
function power() having two versions for it. The first version takes double n and int p and returns a
double value. Another version takes int n and int p returning int value. Use a default value of 2 for p in
case p is omitted in the function call. */

public class question9 {
    private int power;
    private int number1;
    private double number2;
    private int sum = 1;
    private int ssum = 1;
    private double dsum = 1;

    public int power(int number1){
        power = 2;
        for (int i = 0; i < power; i++) {
            sum = sum * number1;
        }
        return sum;
    }
    public int power(int number1, int power){
        for (int i = 0; i < power; i++) {
            ssum = ssum * number1;
        }
        return ssum;
    }
    public double power(double number2, int power){
        for (int i = 0; i < power; i++) {
            dsum = dsum * number2;
        }
        return dsum;
    }
    public static void main (String[] args){
        question9 q = new question9();
        System.out.println(q.power(3));
        System.out.println(q.power(3, 3));
        System.out.println(q.power(1.5, 3));
    }
}
