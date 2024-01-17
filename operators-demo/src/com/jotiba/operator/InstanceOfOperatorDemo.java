package com.jotiba.operator;
import java.util.Scanner;

public class InstanceOfOperatorDemo {

    public static void main(String[] args) {
        String city = "pune";
        Integer length = 23;
        Double temperature = 36.5;

        if(city instanceof String){
            System.out.println("type of city is String");
        }
        else{
            System.out.println("type of city is not String");
        }

        if(length instanceof Integer){
            System.out.println("type of length is integer");
        }
        else{
            System.out.println("type of length is not integer");
        }

        if(temperature instanceof Double){
            System.out.println("type of temperature is double");
        }
        else{
            System.out.println("type of temperature is not double");
        }
    }
}
