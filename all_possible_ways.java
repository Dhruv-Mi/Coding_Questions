package com.company;

import java.util.Scanner;

public class all_possible_ways {
    public static int allWays(int a,int b){
        return allWaysHelp(a,b,1);
    }
    public static int allWaysHelp(int a,int b,int index){
        if(Math.pow(index,b)>a){
            return 0;
        }
        if(Math.pow(index,b)==a){
            return 1;
        }
        int opt1=allWaysHelp((int) (a-Math.pow(index,b)),b,index+1);
        int opt2=allWaysHelp(a,b,index+1);
        return opt1+opt2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int ans=allWays(a,b);
        System.out.println(ans);
    }
}
