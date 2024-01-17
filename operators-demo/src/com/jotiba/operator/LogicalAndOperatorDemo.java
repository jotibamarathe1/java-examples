package com.jotiba.operator;
import java.util.Scanner;

public class LogicalAndOperatorDemo {
        /*write a program to check provided value is greater than 0 and less than 1000
         Pseudo code:
         if (no is greater than 0 && less than 1000 or not)
         ? print - condition matching- all good
         : print - condition not matching-all not good */

    public static void main(String[] args) {
        System.out.println("Please enter value");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if(Integer.valueOf(input) > 0 && Integer.valueOf(input) < 1000){
            System.out.println("condition matching- all good");
        }
        else{
            System.out.println("condition not matching- all not good");
        }
    }
}
