package com.jotiba.operator;

import java.util.Scanner;

public class UnaryOperator {
    int input = 0;

    public void postIncrement(int input) {
        System.out.println("Post increment: " + input++);
        System.out.println("After post increment: " + input);
    }

    public void preIncrement(int input) {
        System.out.println("Pre increment: " + ++input);
        System.out.println("After pre increment: " + input);
    }

    public void postDecrement(int input) {
        System.out.println("Post decrement: " + input--);
        System.out.println("After post decrement: " + input);
    }

    public void preDecrement(int input) {
        System.out.println("Pre decrement: " + --input);
        System.out.println("After pre decrement: " + input);
    }

    public void complementRepresentation(int input) {
        System.out.println("Complement: " + -input);
        System.out.println("after complement: " + input);
    }

    public void negationOperator(boolean flag) {
        System.out.println("negation: " + !flag);
    }

    public static void main(String[] args) {
        System.out.println("Enter integer value");
        Scanner sc = new Scanner(System.in);
        String inputNumber = sc.nextLine();

        UnaryOperator UnaryOperator = new UnaryOperator();
        int input = Integer.valueOf(inputNumber);

        UnaryOperator.postIncrement(input);
        UnaryOperator.preIncrement(input);

        UnaryOperator.postDecrement(input);
        UnaryOperator.preDecrement(input);

        UnaryOperator.complementRepresentation(input);
        UnaryOperator.negationOperator(true);

    }
}
