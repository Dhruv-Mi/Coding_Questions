package com.company;

import java.util.Scanner;

class InvalidCountryException extends Exception{
    String m;

    public InvalidCountryException(String s){
        m=s;
    }

    public String toString(){
        return m;
    }
}

public class Experiment_04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name= sc.next();
        String country= sc.next();
        try{
            if(country.equals("India") || country.equals("india")){
                System.out.println("Name: "+name+",Country: "+country);
            }
            else{
                throw new InvalidCountryException("Invalid Country");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
