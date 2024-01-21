package com.jotiba.practice.exception;

import java.util.Scanner;

public class ExceptionWithFinally {
    public static void acceptPersonalDetails() throws NameNotProvidedException, CityNotProvidedException {
        System.out.println("--------------------------------");
        System.out.println("Enter name for person");
        Scanner Scanner = new Scanner(System.in);
        String name = Scanner.nextLine();
        System.out.println("Enter name for city");
        String city = Scanner.nextLine();

        if (name.isEmpty()) {
            throw new NameNotProvidedException("Provided name is null or zero");
        }
        if (city.isEmpty()) {
            throw new CityNotProvidedException("Provided city is null or zero");
        }
        System.out.println("Personal details are: " + name + "," + city);
    }

    public static void main(String[] args) {
       while(true){
           try{
               acceptPersonalDetails();
           }catch(NameNotProvidedException | CityNotProvidedException ex){   //exception improvement in 1.7
               System.err.println(ex.getMessage());
           }finally{
               System.out.println("Enter data carefully");
           }

          /* or

           catch(NameNotProvidedException ex){
               System.err.println(ex.getMessage());
           }catch(CityNotProvidedException ex1){
               System.err.println(ex1.getMessage());
           }*/

       }
    }
}