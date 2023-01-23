package com.company;

import java.util.Scanner;

public class Experiment_01 {
    public static int factorial(int n){
        int ans=1;
        for(int i=1;i<=n;i++){
            ans=ans*i;
        }
        return ans;
    }
    public static boolean palindrome(int n){
        int reverse=0;
        int temp=n;
        while(n!=0){
            reverse=reverse*10+n%10;
            n=n/10;
        }
        return reverse==temp;
    }
    public static void fibonacci(int n){
        int start=0;
        int end=1;
        for(int i=0;i<n;i++){
            System.out.print(start+",");
            int temp=start+end;
            start=end;
            end=temp;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int fact_ans=factorial(n);
        System.out.println("Factorial ans: "+fact_ans);
        n= sc.nextInt();
        boolean palindrome_ans=palindrome(n);
        System.out.println("Palindrome ans: "+palindrome_ans);
        n= sc.nextInt();
        fibonacci(n);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int d= sc.nextInt();
        int largest=Math.max(a,Math.max(b,Math.max(c,d)));
        int smallest=Math.min(a,Math.min(b,Math.min(c,d)));
        int average=(a+b+c+d)/4;
        System.out.println("Largest: "+largest);
        System.out.println("Smallest: "+smallest);
        System.out.println("Average: "+average);
    }
}
