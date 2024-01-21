package com.jotiba.practice.exception;
import java.util.Scanner;

public class ExceptionWithThrows {
    public static void division() throws NumberFormatException {
        System.out.println("Enter 2 values");
        Scanner Scanner = new Scanner(System.in);
        String input1 = Scanner.nextLine();
        String input2 = Scanner.nextLine();

        int number1 = Integer.valueOf(input1);
        int number2 = Integer.valueOf(input2);
        System.out.println("Division of " + number1 + " and " +  number2 + " is: " + (number1 /  number2));
    }
        public static void process() {
            try {
                division();
            }catch (NumberFormatException ex){
                System.err.println(ex.getMessage());
            }
        }

    public static void main(String[] args) {
        process();
    }
    }
