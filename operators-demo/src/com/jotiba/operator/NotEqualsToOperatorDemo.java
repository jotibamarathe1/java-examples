package com.jotiba.operator;
import java.util.Scanner;

public class NotEqualsToOperatorDemo {
     /*write a program to identify given no is not equals to 100 or not
        Psuedo code:
        if(no is not equals to 100 or not)
            ? print unmatched
            : print matched*/

    public static void main(String[] args) {
        System.out.println("Please enter value");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if(Integer.valueOf(input) != 100){
            System.out.println("non-matching - non-century");
        }
        else{
            System.out.println("matching - century");
        }
    }
}

