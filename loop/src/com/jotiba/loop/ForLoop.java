package com.jotiba.loop;

public class ForLoop {
    /*write a program to print starting number from 1 to 10 using for loop
     Psuedo code:
     write a method to print a numbers till 10 starting from 1.
     print the number using loop.

     for(declaration; condition; increment/decrement){
         statements;
     }
      */

    private void printNo(int no) {
        System.out.println(no);
    }
    public static void main(String[] args) {
        ForLoop loopClass = new ForLoop();

         for(int no = 1; no <= 10; no++ ) {
             loopClass.printNo(no);  //print the number using loop
         }
    }
}
