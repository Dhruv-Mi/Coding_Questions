package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Fizz_Buzz {
    public static ArrayList<String> fizzBuzz(int n){
        ArrayList<String> ans=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0&&i%5==0){
                ans.add("FizzBuzz");
            }
            else if(i%3==0){
                ans.add("Fizz");
            }
            else if(i%5==0){
                ans.add("Buzz");
            }
            else{
                ans.add(""+i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        ArrayList<String> ans=fizzBuzz(n);
        for (String an : ans) {
            System.out.print(an + " ");
        }
    }
}
