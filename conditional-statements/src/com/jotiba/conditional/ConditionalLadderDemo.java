package com.jotiba.conditional;
import java.util.Scanner;

public class ConditionalLadderDemo {
     /*write a program to accept the integer number and print the number in words.
      Psuedo code:
          accept the number from user
          if (no <= 10) {
            if (no == 0) --> print "Zero"
            if (no == 1) --> print "One"
            if (no == 2) --> print "Two"
            if (no == 3) --> print "Three"
            if (no == 4) --> print "Four"
            if (no == 5) --> print "Five"
            if (no == 6) --> print "Six"
            if (no == 7) --> print "Seven"
            if (no == 8) --> print "Eight"
            if (no == 9) --> print "Nine"
            if (no == 10) --> print "Ten"
           }
          else if (no <= 20){
            if (no == 11) --> print "Eleven"
            if (no == 12) --> print "Twelve"
            if (no == 13) --> print "Thirteen"
            if (no == 14) --> print "Fourteen"
            if (no == 15) --> print "Fifteen"
            if (no == 16) --> print "Sixteen"
            if (no == 17) --> print "Seventeen"
            if (no == 18) --> print "Eighteen"
            if (no == 19) --> print "Nineteen"
            if (no == 20) --> print "Twenty"
           }
           .
           .
           .
           else{
           print "number doesn't match or greater than 100"
           }
      */

    private static int acceptNumber() {  //access_specifier return_type method_name(parameters){method body}
        System.out.println("Please enter value");
        Scanner sc = new Scanner(System.in);
        int input = Integer.valueOf(sc.nextLine());
        return input;
    }

    private static void printNumber(int no) {
        if (no <= 10) {                            //Nested if
            if (no == 0) {
                System.out.println("Zero");
            }
            if (no == 1) {
                System.out.println("One");
            }
            if (no == 2) {
                System.out.println("Two");
            }
            if (no == 3) {
                System.out.println("Three");
            }
            if (no == 4) {
                System.out.println("Four");
            }
            if (no == 5) {
                System.out.println("Five");
            }
            if (no == 6) {
                System.out.println("Six");
            }
            if (no == 7) {
                System.out.println("Seven");
            }
            if (no == 8) {
                System.out.println("Eight");
            }
            if (no == 9) {
                System.out.println("Nine");
            }
            if (no == 10) {
                System.out.println("Ten");
            }
        } else if (no <= 20) {                         //if else ladder
            if (no == 11) {
                System.out.println("Eleven");
            }
            if (no == 12) {
                System.out.println("Twelve");
            }
            if (no == 13) {
                System.out.println("Thirteen");
            }
            if (no == 14) {
                System.out.println("Fourteen");
            }
            if (no == 15) {
                System.out.println("Fifteen");
            }
            if (no == 16) {
                System.out.println("Sixteen");
            }
            if (no == 17) {
                System.out.println("Seventeen");
            }
            if (no == 18) {
                System.out.println("Eighteen");
            }
            if (no == 19) {
                System.out.println("Nineteen");
            }
            if (no == 20) {
                System.out.println("Twenty");
            }
        } else if (no <= 30) {
            if (no == 21) {
                System.out.println("Twenty One");
            }
            if (no == 22) {
                System.out.println("Twenty Two");
            }
            if (no == 23) {
                System.out.println("Twenty Three");
            }
            if (no == 24) {
                System.out.println("Twenty Four");
            }
            if (no == 25) {
                System.out.println("Twenty Five");
            }
            if (no == 26) {
                System.out.println("Twenty Six");
            }
            if (no == 27) {
                System.out.println("Twenty Seven");
            }
            if (no == 28) {
                System.out.println("Twenty Eight");
            }
            if (no == 29) {
                System.out.println("Twenty Nine");
            }
            if (no == 30) {
                System.out.println("Thirty");
            }
        } else if (no <= 40) {
            if (no == 31) {
                System.out.println("Thirty One");
            }
            if (no == 32) {
                System.out.println("Thirty Two");
            }
            if (no == 33) {
                System.out.println("Thirty Three");
            }
            if (no == 34) {
                System.out.println("Thirty Four");
            }
            if (no == 35) {
                System.out.println("Thirty Five");
            }
            if (no == 36) {
                System.out.println("Thirty six");
            }
            if (no == 37) {
                System.out.println("Thirty Seven");
            }
            if (no == 38) {
                System.out.println("Thirty Eight");
            }
            if (no == 39) {
                System.out.println("Thirty Nine");
            }
            if (no == 40) {
                System.out.println("Forty");
            }
        } else if (no <= 50) {
            if (no == 41) {
                System.out.println("Forty One");
            }
            if (no == 42) {
                System.out.println("Forty Two");
            }
            if (no == 43) {
                System.out.println("Forty Three");
            }
            if (no == 44) {
                System.out.println("Forty Four");
            }
            if (no == 45) {
                System.out.println("Forty Five");
            }
            if (no == 46) {
                System.out.println("Forty six");
            }
            if (no == 47) {
                System.out.println("Forty Seven");
            }
            if (no == 48) {
                System.out.println("Forty Eight");
            }
            if (no == 49) {
                System.out.println("Forty Nine");
            }
            if (no == 50) {
                System.out.println("Fifty");
            } else {
                System.out.println("number doesn't match or greater than 100");
            }
        }
    }

    public static void main(String[] args) {
        int input = acceptNumber();
        printNumber(input);
    }
}
