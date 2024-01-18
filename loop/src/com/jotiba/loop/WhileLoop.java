package com.jotiba.loop;

public class WhileLoop {
    /*write a program to print starting number from 1 to 10 using while loop
     Psuedo code:
     write a method to print a number.
     print the number using loop and start loop with 1.

     while(condition){
        statements;
        }
      */

    private void printNo(int no) {
        System.out.println(no);
    }

    public static void main(String[] args) {
        WhileLoop loopClass = new WhileLoop();
        int no = 1;

        while(no <= 10) {
            loopClass.printNo(no);  //print the number using loop
            no++;
        }
    }
}
