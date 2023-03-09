package com.company;

import java.util.Scanner;

public class Rotate_string {
    public static boolean rotateString(String s,String goal){
        int length=s.length();
        String temp=s;
        for(int i=0;i<length;i++){
            if(temp.equals(goal)){
                return true;
            }
            temp=temp.charAt(length-1)+temp.substring(0,length-1);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        String goal= sc.next();
        boolean ans=rotateString(s,goal);
        System.out.println(ans);
    }
}
