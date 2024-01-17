package com.jotiba.operator;
import java.util.Scanner;

public class GreaterThanOperatorDemo {
    /*write a program to identify given no if greater than 100 or not
        Psuedo code:
        int no = 99;
        if(no is greater than 100 or not)                   no > 100 -> boolean -> false
            ? print good number
            : print bad number*/

    public static void main(String[] args) {
        System.out.println("Please enter value");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (Integer.valueOf(input) > 100) {
            System.out.println("Good Number");
        } else {
            System.out.println("Bad Number");
        }
    }
}

