package com.jotiba.loop;

public class WhileLoopStarPattern1 {
//    write a program to print star using while loop
//     Psuedo code:
//     *
//     *   *
//     *   *   *
//     *   *   *   *
//     *   *   *   *   *

//step 1
//row = 1
//column = 1

//step 2
//row = row++ -> 2     (column <= row)
//column = 1
//column = 2

//step 3
//row = 3
//column = 1
//column = 2
//column = 3

    public static void main(String[] args) {
        int row = 1;

        while(row <= 5) {
            int column = 1;

            while(column <= row) {
                System.out.print("*\t");
                column++;
            }
            System.out.println();
            row++;
        }
    }
}

