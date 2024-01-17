package com.jotiba.conditional;
import java.util.Scanner;

public class SwitchDemo {
      /*write a program to accept the integer number and print the number in words.
    switch case:
    Psuedo code:
    accept the number from user
    switch(no)
       case 0:print "Zero" break;
       case 1:print "One" break;
       case 2:print "Two" break;
       case 3:print "Three" break;
       case 4:print "Four" break;
       case 5:print "Five" break;
       case 6:print "Six" break;
       case 7:print "Seven" break;
       case 8:print "Eight" break;
       case 9:print "Nine" break;
       case 10:print "Ten" break;
      */

    public static void main(String[] args) {
        int input = acceptNumber();
        printNumber(input);
    }

    private static int acceptNumber() {  //access_specifier return_type method_name(parameters){method body}
        System.out.println("Please enter value");
        Scanner sc = new Scanner(System.in);
        int input = Integer.valueOf(sc.nextLine());
        return input;
    }

    private static void printNumber(int no) {
        switch (no) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 10:
                System.out.println("Ten");
                break;

            default:
                System.out.println("Number of greater than ten");
        }
    }
}
