package com.company;

import java.util.Scanner;

public class Check_if_two_strings_arrays_are_equivalent {
    public static boolean arrayStringsAreEqual(String[] word1,String[] word2){
        StringBuilder str1= new StringBuilder();
        for (String value : word1) {
            str1.append(value);
        }
        StringBuilder str2= new StringBuilder();
        for (String s : word2) {
            str2.append(s);
        }
        return str1.toString().equals(str2.toString());
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1= sc.nextInt();
        String[] word1=new String[n1];
        for(int i=0;i<n1;i++){
            word1[i]=sc.next();
        }
        int n2=sc.nextInt();
        String[] word2=new String[n2];
        for(int i=0;i<n2;i++){
            word2[i]=sc.next();
        }
        boolean ans=arrayStringsAreEqual(word1,word2);
        System.out.println(ans);
    }
}
