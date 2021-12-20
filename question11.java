package com.company;

import java.util.Scanner;

/* Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster, etc. In the base class, provide
methods that are common to all Rodents, and override these in the derived classes to perform different
behaviors depending on the specific type of Rodent. Create an array of Rodent, fill it with different
specific types of Rodents, and call your base-class methods to see what happens. */
class Rodent{
    int sum = 0;
    Scanner input = new Scanner(System.in);
    public int arr(int size){
        System.out.println("This is Parent class as Rodent");
        int [] arr = new int[size];
        for (int i = 0; i < arr[i]; i++) {
            arr[i] = input.nextInt();
            sum = sum + arr[i];
        }
        return sum;
    }
}
class Mouse extends Rodent{
    @Override
    public int arr(int size){
        int [] arr = new int[size];
        System.out.println("This is first child class as Mouse");
        for (int i = 0; i < arr[i]; i++) {
            arr[i] = input.nextInt();
            if (i%2 == 0){
                sum = sum + arr[i];
            }
        }
        return sum;
    }
}
class Gerbil extends Rodent{
    @Override
    public int arr(int size){
        int [] arr = new int[size];
        System.out.println("This is second child class as Gerbil");
        for (int i = 0; i < arr[i]; i++) {
            arr[i] = input.nextInt();
            if (i%2 != 0){
                sum = sum + arr[i];
            }
        }
        return sum;
    }
}
class Hamster extends Rodent{
    @Override
    public int arr(int size) {
        System.out.println("This is third child class as Hamster");
        sum  = sum + size;
        return sum;
    }
}
public class question11 {
    public static void main(String[] args){
        Rodent obj = new Rodent();
        System.out.println(obj.arr(35));

        Rodent obj1 = new Mouse();
        System.out.println(obj1.arr(3));

        Rodent obj2 = new Gerbil();
        System.out.println(obj2.arr(2));

        Rodent obj3 = new Hamster();
        System.out.println(obj3.arr(4));
    }
}
