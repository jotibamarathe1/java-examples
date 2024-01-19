package com.jotiba.practice.arrays;

public class MultidimensionalArrayDemo {
    public static void main(String[] args) {
        int[][] marks = new int[5][3];
        marks[0][0] = 45;
        marks[0][1] = 48;
        marks[0][2] = 56;

        marks[1][0] = 59;
        marks[1][1] = 46;
        marks[1][2] = 57;

        marks[2][0] = 87;
        marks[2][1] = 47;
        marks[2][2] = 58;

        marks[3][0] = 80;
        marks[3][1] = 48;
        marks[3][2] = 89;

        marks[4][0] = 76;
        marks[4][1] = 49;
        marks[4][2] = 90;

        System.out.println("Size of array is: " + marks.length);

        //while loop demo for array
//        System.out.println("Demo of while loop:");
//        int i = 0;
//        while (i < marks.length) {
//            i++;
//            int j = 0;
//            while (j < marks.length) {
//                j++;
//                System.out.print(marks[i][j] + "\t");
//                  }
//          System.out.println();
//            }

        //for loop demo for array
        System.out.println("-----------------------------");
        System.out.println("Demo of for loop");
        for (int row = 0; row < marks.length; row++) {
            for(int column = 0; column < marks[row].length; column++){
                System.out.print(marks[row][column] + "\t");
            }
            System.out.println();
        }

        //for each loop demo for array
        System.out.println("-----------------------------");
        System.out.println("Demo of for-each loop");
        for (int[] arrayOne : marks) {
            for (int arrayTwo : arrayOne) {
                System.out.print(arrayTwo + "\t");
            }
            System.out.println();
        }
    }
}