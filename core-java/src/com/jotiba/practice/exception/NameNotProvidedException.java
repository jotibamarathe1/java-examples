package com.jotiba.practice.exception;

public class NameNotProvidedException extends Exception{
    NameNotProvidedException(String msg){
        super(msg);                                        //super keyword is used to invoke parent class constructor
    }
}
