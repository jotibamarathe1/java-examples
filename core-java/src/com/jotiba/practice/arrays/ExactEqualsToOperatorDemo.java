package com.jotiba.operator;
import java.util.Scanner;

public class ExactEqualsToOperatorDemo {
    /*write a program to identify given no is exact equals to 100 or not
        Psuedo code:
        if(no is exact equals to 100 or not)
            ? print century
            : print non-century*/

    public static void main(String[] args) {
        System.out.println("Please enter value");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if(Integer.valueOf(input) == 100){
            System.out.println("matching - century");
        }
        else{
            System.out.println("non-matching  - non-century");
        }
    }
}

