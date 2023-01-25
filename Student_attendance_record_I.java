package com.company;

import java.util.Scanner;

public class Student_attendance_record_I {
    public static boolean checkRecord(String s){
        int A_count=0;
        int L_count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='L'){
                L_count++;
            }
            else{
                if(ch=='A'){
                    A_count++;
                }
                if(L_count>=3){
                    return false;
                }
                else{
                    L_count=0;
                }
            }
        }
        if(L_count>=3){
            return false;
        }
        return A_count < 2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        boolean ans=checkRecord(s);
        System.out.println(ans);
    }
}
