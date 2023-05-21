package com.company;

import java.util.Scanner;

public class Shuffle_string {
    public static String restoreString(String s,int[] indices){
        Character[] arr=new Character[s.length()];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            arr[indices[i]]=ch;
        }
        StringBuilder ans= new StringBuilder();
        for (Character character : arr) {
            ans.append(character);
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        int n= sc.nextInt();
        int[] indices=new int[n];
        for(int i=0;i<n;i++){
            indices[i]= sc.nextInt();
        }
        String ans=restoreString(s,indices);
        System.out.println(ans);
    }
}
