package com.jotiba.loop;

public class DoWhileLoop {
    /*write a program to print starting number from 1 to 10 using do while loop
     Psuedo code:
     write a method to print a numbers till 10 starting from 1.
     print the number using loop.

     do{
        statements;
        }while(condition);
      */

    private void printNo(int no) {
        System.out.println(no);
    }
    public static void main(String[] args) {
        DoWhileLoop loopClass = new DoWhileLoop();
        int no = 1;

         do{
            loopClass.printNo(no);  //print the number using loop
            no++;
        }while(no <= 10);
    }
}
