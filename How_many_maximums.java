package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class How_many_maximums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for (int i=0;i<t;i++){
            int n= sc.nextInt();
            String input= sc.next();
            int count=1;
            for (int j=0;j<input.length()-1;j++){
                if(input.charAt(j)=='1'&&input.charAt(j+1)=='0'){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
