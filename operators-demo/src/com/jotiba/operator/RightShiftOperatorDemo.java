package com.jotiba.operator;
import java.util.Scanner;

public class RightShiftOperatorDemo {
    /*Psuedo code : write a program to shift the bit by 4 to right*/

    public static void main(String[] args) {
        System.out.println("Please enter value");
        Scanner sc = new Scanner(System.in);
        int input = Integer.valueOf(sc.nextLine());

        System.out.println("result: " + (input >> 2));
    }
}
