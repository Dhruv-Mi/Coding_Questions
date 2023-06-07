package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Second_largest_digit_in_a_string {
    public static int secondHighest(String s){
        int length=s.length();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<length;i++){
            char ch=s.charAt(i);
            if(ch>='0' && ch<='9'){
                int temp=Integer.parseInt(ch+"");
                if(!arr.contains(temp)){
                    arr.add(temp);
                }
            }
        }
        Collections.sort(arr);
        if(arr.size()>1){
            return arr.get(arr.size()-2);
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        int ans=secondHighest(s);
        System.out.println(ans);
    }
}
