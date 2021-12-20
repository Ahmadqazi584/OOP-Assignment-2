package com.company;

import java.util.Scanner;

/*Write definitions for two versions of an overloaded function. This function’s 1st version sum() takes an
argument, int array, and returns the sum of all the elements of the passed array. The 2nd version of
sum() takes two arguments, an int array and a character (‘E’ or ‘O’). If the passed character is ‘E’, it
returns the sum of even elements of the passed array and is the passed character is ‘O’, it returns the
sum of odd elements. In case of any other character, it returns 0 (zero). */
public class question10 {
    int sum = 0;
    public int sum(int size){
        Scanner input1 = new Scanner(System.in);
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the number"+(i+1) + ": ");
            arr[i] = input1.nextInt();
            sum = sum + arr[i];
        }
        return sum;
    }
    public int sum(int size, char ch){
        Scanner input2 = new Scanner(System.in);
        int [] arr = new int[size];
        System.out.println("Enter the second argument as 'E' or '0'");
        if (ch == 'E') {
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter the number"+(i+1) + ": ");
                arr[i] = input2.nextInt();
                if (i % 2 == 0) {
                    sum = sum + arr[i];
                }
            }
        }else if (ch == '0'){
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter the number"+(i+1) + ": ");
                arr[i] = input2.nextInt();
                if (i % 2 != 0){
                    sum = sum + arr[i];
                }
            }
        }else {
            sum = 0;
        }
        return sum;
    }
    public void displayResult(){
        if (sum > 0 ){
            System.out.println("The total sum of your entered number: " + sum);
        }else {
            System.out.println("Please re-enter the values again Please");
        }
    }
    public static void main(String[] args){
        question10 q = new question10();
        Scanner input = new Scanner(System.in);
        q.sum(input.nextInt());
        q.sum(input.nextInt(), input.next().charAt(0));
        q.displayResult();
    }
}
