package com.company;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class palindrome_Linked_list {
    public static boolean isPalindrome(LinkedList<Integer> head){
        StringBuilder val= new StringBuilder();
        while(!head.isEmpty()){
           val.append(head.removeFirst());
        }
        System.out.println(val);
        StringBuilder reverseVal= new StringBuilder();
        for(int i=val.length()-1;i>=0;i--){
            reverseVal.append(val.charAt(i));
        }
        return val.toString().equals(reverseVal.toString());
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        LinkedList<Integer> list=new LinkedList<>();
        for(int i=0;i<n;i++){
            int data= sc.nextInt();
            list.add(data);
        }
        boolean ans=isPalindrome(list);
        System.out.println(ans);
    }
}
