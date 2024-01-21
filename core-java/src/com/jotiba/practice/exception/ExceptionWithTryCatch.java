package com.jotiba.practice.exception;
import java.util.Scanner;

public class ExceptionWithTryCatch {
    public static void main(String[] args) {
        System.out.println("Enter 2 values");
        Scanner Scanner = new Scanner(System.in);
        String input1 = Scanner.nextLine();
        String input2 = Scanner.nextLine();

        try{
            int number1 = Integer.valueOf(input1);
            int number2 = Integer.valueOf(input2);
            System.out.println("Division of " + number1 + " and " + number2 + " is: " + (number1/number2));
        }catch(NumberFormatException exception){
            System.err.println("Entered values are not valid numbers");
        }
    }
}
