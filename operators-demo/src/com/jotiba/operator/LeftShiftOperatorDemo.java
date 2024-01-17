package com.jotiba.operator;
import java.sql.SQLOutput;
import java.util.Scanner;

public class LeftShiftOperatorDemo {
    /*Psuedo code : write a program to shift the bit by 4 to left*/

    public static void main(String[] args) {
        System.out.println("Please enter value");
        Scanner sc = new Scanner(System.in);
        int input = Integer.valueOf(sc.nextLine());

        System.out.println("result: " + (input << 4));
    }
}
