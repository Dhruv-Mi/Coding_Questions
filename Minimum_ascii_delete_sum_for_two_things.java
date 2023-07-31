package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Minimum_ascii_delete_sum_for_two_things {
    static String hold="";
    public static int minimumDeleteSum(String s1,String s2){
        minimumDeleteSumHelper(s1,s2,0,0);
        System.out.println(hold);
        int ans=0;
        for(int i=0;i<hold.length();i++){
            char ch=hold.charAt(i);
            int index=s1.indexOf(ch);
            s1=s1.substring(0,index)+s1.substring(index+1);
        }
        for(int i=0;i<hold.length();i++){
            char ch=hold.charAt(i);
            int index=s2.indexOf(ch);
            s2=s2.substring(0,index)+s2.substring(index+1);
        }
        for(int i=0;i<s1.length();i++){
            ans+=s1.charAt(i);
        }
        for(int i=0;i<s2.length();i++){
            ans+=s2.charAt(i);
        }
        return ans;
    }
    public static void minimumDeleteSumHelper(String s1,String s2,int index1,int index2){
        if(Objects.equals(s1, s2)){
//            System.out.println(s1);
            if(hold.length()<s1.length()){
                hold=s1;
                return;
            }
        }
        if(index1>=s1.length() || index2>=s2.length()){
            if(s1.length()<s2.length() && hold.length()<s1.length()){
                hold=s1;
            }
            else if(s2.length()<s1.length() && hold.length()<s2.length()){
                hold=s2;
            }
            return;
        }
        if(s1.charAt(index1)==s2.charAt(index2)){
            minimumDeleteSumHelper(s1,s2,index1+1,index2+1);
        }
        else{
            String s = s1.substring(0, index1) + s1.substring(index1 + 1);
            minimumDeleteSumHelper(s,s2,index1,index2);
            String s3 = s2.substring(0, index2) + s2.substring(index2 + 1);
            minimumDeleteSumHelper(s1, s3,index1,index2);
            minimumDeleteSumHelper(s,s3,index1,index2);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1= sc.next();
        String s2= sc.next();
        int ans=minimumDeleteSum(s1,s2);
        System.out.println(ans);
    }
}
