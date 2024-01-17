package com.jotiba.operator;
import java.util.Scanner;

public class TernaryOperatorDemo {
        /*write a program and accept the no as input; check the no is less than 0 ->print negative no or else positive no
        Pseudo code:
        accept the no as input;
        check if no is less than 0
                -> print negative no
              else
                -> print positive no

                (input < 0)
                ? "negative number"
                : "positive number" */

    public static void main(String[] args) {
        System.out.println("Please enter value");
        Scanner sc = new Scanner(System.in);
        int input = Integer.valueOf(sc.nextLine());

        /*if else representation*/
        if(input < 0){
            System.out.println("negative number");
        }
        else{
            System.out.println("positive number");
        }

        /*ternary operator representation*/
        System.out.println((input) < 0 ? "negative number" : "positive number");
    }
}
