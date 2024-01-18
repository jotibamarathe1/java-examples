package com.jotiba.loop;

public class ForEachLoop {
    /*Psuedo code:
         write a method to print a numbers till 10 starting from 1.
         print the number using loop.
     }
     */

    private void printNo(int...nos) {
        for(int no : nos){
            System.out.println(no);
        }
    }
    public static void main(String[] args) {
        ForEachLoop loopClass = new ForEachLoop();

        loopClass.printNo(1);
        System.out.println("-----------------------------");
        loopClass.printNo(1,2,3);
        System.out.println("-----------------------------");
        loopClass.printNo(1,2,3,4,5);
        System.out.println("-----------------------------");
        loopClass.printNo(1,2,3,4,5,6,7);
        System.out.println("-----------------------------");
        loopClass.printNo(1,2,3,4,5,6,7,8,9,10);
        System.out.println("-----------------------------");
    }
}
