package com.jotiba.practice.arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int marks[] = new int[5];
        marks[0] = 45;
        marks[1] = 57;
        marks[2] = 98;
        marks[3] = 38;
        marks[4] = 76;

        System.out.println("Size of array is: " + marks.length);

        //while loop demo for array
        System.out.println("Demo of while loop:");
        int position = 0;
        while (position < marks.length) {
            System.out.println(marks[position]);
            position++;
        }

        //for loop demo for array
        System.out.println("-----------------------------");
        System.out.println("Demo of for loop");
        for (int index = 0; index < marks.length; index++) {
            System.out.println(marks[index]);
        }

        //for each loop demo for array
        System.out.println("-----------------------------");
        System.out.println("Demo of for-each loop");
        for (int number : marks) {
            System.out.println(number);
        }
    }
}