package com.company;

import java.util.Scanner;

public class Reformat_phone_number {
    public static String reformatNumber(String number){
        int length=number.length();
        StringBuilder newNumber= new StringBuilder();
        for(int i=0;i<length;i++){
            char ch=number.charAt(i);
            if(ch!=' ' && ch!='-'){
                newNumber.append(ch);
            }
        }
        int newLength=newNumber.length();
        int remaining=newLength%3;
        StringBuilder ans= new StringBuilder();
        int count=0;
        if(remaining==1){
            for(int i=0;i<newLength-4;i++){
                char ch=newNumber.charAt(i);
                ans.append(ch);
                count++;
                if(count==3){
                    ans.append('-');
                    count=0;
                }
            }
            for(int i=newLength-4;i<newLength;i++){
                char ch=newNumber.charAt(i);
                ans.append(ch);
                count++;
                if(count==2){
                    ans.append('-');
                    count=0;
                }
            }
        }
        else{
            for(int i=0;i<newLength;i++){
                char ch=newNumber.charAt(i);
                ans.append(ch);
                count++;
                if(count==3){
                    ans.append('-');
                    count=0;
                }
            }
        }
        if(ans.charAt(ans.length()-1)=='-'){
            return ans.substring(0,ans.length()-1);
        }
        else {
            return ans.toString();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String number= sc.nextLine();
        String ans=reformatNumber(number);
        System.out.println(ans);
    }
}
