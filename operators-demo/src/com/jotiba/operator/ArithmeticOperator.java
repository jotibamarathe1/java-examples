package com.jotiba.operator;
import java.util.Scanner;

public class ArithmeticOperator {
    int firstNumber = 0;
    int secondNumber = 0;

    public void addition() {
        int addition = firstNumber + secondNumber;
        System.out.println("Addition of two number is: " + addition);
    }

    public void subtraction() {
        int subtraction = firstNumber - secondNumber;
        System.out.println("subtraction of two number is: " + subtraction);
    }

    public void multiplication() {
        int multiplication = firstNumber * secondNumber;
        System.out.println("multiplication of two number is: " + multiplication);
    }

    public void division() {
        int division = firstNumber / secondNumber;
        System.out.println("division of two number is: " + division);
    }

    public void modulation() {
        int modulation = firstNumber % secondNumber;
        System.out.println("remainder of two number is: " + modulation);
    }

    public static void main(String[] args) {

        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();

        ArithmeticOperator ArithmeticOperator = new ArithmeticOperator();
        ArithmeticOperator.firstNumber = firstNumber;
        ArithmeticOperator.secondNumber = secondNumber;

        ArithmeticOperator.addition();
        ArithmeticOperator.subtraction();
        ArithmeticOperator.multiplication();
//        ArithmeticOperator.division();
//        ArithmeticOperator.modulation();



        if (ArithmeticOperator.secondNumber != 0 && ArithmeticOperator.firstNumber > 0){
            ArithmeticOperator.division();
            ArithmeticOperator.modulation();
        } else {
            System.out.println("Execution without division and modulation");
        }
    }
}
