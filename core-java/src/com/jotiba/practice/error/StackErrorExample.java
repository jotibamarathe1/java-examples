package com.jotiba.practice.error;

public class StackErrorExample {
    public static void check(int i){
        if(i == 0){
        }
        else{
            check(i++);
        }
    }
    public static void main(String[] args) {
        StackErrorExample.check(5);
    }
}
