package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Optimal_partition_of_string {
    public static int partitionString(String s){
        int length=s.length();
        ArrayList<Character> arr=new ArrayList<>();
        int ans=0;
        for(int i=0;i<length;i++){
            char ch=s.charAt(i);
            if(arr.contains(ch)){
                ans++;
                arr=new ArrayList<>();
                i--;
            }
            else{
                arr.add(ch);
            }
        }
        if(!arr.isEmpty()){
            return ans+1;
        }
        else{
            return ans;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        int ans=partitionString(s);
        System.out.println(ans);
    }
}
