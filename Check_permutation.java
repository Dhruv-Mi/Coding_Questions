package com.company;

import java.util.*;

public class Check_permutation {
    public static boolean isPermutation(String str1,String str2){
        char[] char1=str1.toCharArray();
        char[] char2=str2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        String sorted1=new String(char1);
        String sorted2=new String(char2);
        int len1=sorted1.length();
        int len2=sorted2.length();
        int i;
        if(len1==len2){
            for(i=0;i<len1;i++){
                if(sorted1.charAt(i)!=sorted2.charAt(i)){
                    return false;
                }
            }
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1= sc.nextLine();
        String str2= sc.nextLine();
        boolean check=isPermutation(str1,str2);
        System.out.println(check);
    }
}
