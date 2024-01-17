package com.jotiba.operator;
import java.util.Scanner;

public class LogicalOrOperatorDemo {
        /*write a program to check provided value is divisible 17 or divisible by 2
        Pseudo code:
        if(no is divisible 17 or divisible by 2)
        ? print - condition matching - found the matching value
        : print condition Not matching- all Not good*/

    public static void main(String[] args) {
        System.out.println("Please enter value");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if(Integer.valueOf(input) % 17 == 0 || Integer.valueOf(input) % 2 == 0){
            System.out.println("condition matching- found the matching value");
        }
        else{
            System.out.println("condition not matching- all Not good");
        }
    }
}
