package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class DI_string_match {
    public static int[] diStringMatch(String s){
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<=s.length();i++){
            arr.add(i);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<s.length();i+=2){
            if(i==s.length()-1){
                if(s.charAt(i)=='I'){
                    ans.add(arr.remove(0));
                    ans.add(arr.remove(0));
                }
                else{
                    ans.add(arr.remove(arr.size()-1));
                    ans.add(arr.remove(arr.size()-1));
                }
            }
            else{
                if(s.charAt(i)=='I' && s.charAt(i+1)=='I'){
                    ans.add(arr.remove(0));
                    ans.add(arr.remove(0));
                }
                else if(s.charAt(i)=='D' && s.charAt(i+1)=='D'){
                    ans.add(arr.remove(arr.size()-1));
                    ans.add(arr.remove(arr.size()-1));
                }
                else if(s.charAt(i)=='I' && s.charAt(i+1)=='D'){
                    ans.add(arr.remove(0));
                    ans.add(arr.remove(arr.size()-1));
                }
                else{
                    ans.add(arr.remove(arr.size()-1));
                    ans.add(arr.remove(0));
                }
            }
        }
        if(arr.size()!=0){
            ans.add( arr.get(0));
        }
        int[] result=new int[ans.size()];
        for(int i=0;i< result.length;i++){
            result[i]= ans.get(i);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        int[] ans=diStringMatch(s);
        for (int an : ans) {
            System.out.print(an + " ");
        }
    }
}
