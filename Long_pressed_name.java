package com.company;

import java.util.Scanner;

public class Long_pressed_name {
    public static boolean isLongPressedName(String name,String typed){
        int n = name.length();
        int m = typed.length();
        int i=0;
        int j=0;
        if(name.charAt(0) != typed.charAt(0))
            return false;
        if(n>m){
            return false;
        }
        while(i<n && j<m){
            if(name.charAt(i) == typed.charAt(j)){
                i++;
                j++;
            }
            else if(name.charAt(i-1) == typed.charAt(j)){
                j++;
            }
            else{
                return false;
            }
        }
        while(j<m){
            if(name.charAt(i-1) == typed.charAt(j)){
                j++;
            }
            else{
                return false;
            }
        }
        return i >= n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name= sc.next();
        String typed= sc.next();
        boolean ans=isLongPressedName(name,typed);
        System.out.println(ans);
    }
}
