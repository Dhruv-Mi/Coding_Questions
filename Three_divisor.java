package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Three_divisor {
    public static boolean isThree(int n){
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i*j==n && !arr.contains(i)){
                    arr.add(i);
                }
                if(arr.size()>3){
                    return false;
                }
            }
        }
        return arr.size()==3;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        boolean ans=isThree(n);
        System.out.println(ans);
    }
}
