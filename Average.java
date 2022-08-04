package com.company;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name= sc.nextLine();
        int marks1,marks2,marks3;
        marks1=sc.nextInt();
        marks2=sc.nextInt();
        marks3=sc.nextInt();
        System.out.println(name.charAt(0));
        int average=(marks1+marks2+marks3)/3;
        System.out.print(average);
    }
}
