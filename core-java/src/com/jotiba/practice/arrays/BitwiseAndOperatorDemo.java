package com.jotiba.operator;
import java.util.Scanner;

public class BitwiseAndOperatorDemo {
    static int firstNumber = 0;
    static int secondNumber = 0;

    private static void bitwiseAndOperator() {
        int result = firstNumber & secondNumber;
        System.out.println("bitwise AND result: " + result);
    }

    public static void main(String[] args) {

        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        firstNumber = Integer.valueOf(sc.nextLine());
        secondNumber = Integer.valueOf(sc.nextLine());

        bitwiseAndOperator();

    }
}
