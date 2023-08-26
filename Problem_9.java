package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Problem_9 {
    public static String dectoNBase(int n,int num){
        StringBuilder ans= new StringBuilder();
        HashMap<Integer,Character> map=new HashMap<>();
        for(int i=0;i<26;i++){
            map.put(i+10, (char) ('A'+i));
        }
        while(num!=0){
            int temp=num%n;
            if(temp>=0 && temp<=9){
                ans.insert(0, temp);
            }
            else {
                ans.insert(0, map.get(temp));
            }
            num=num/n;
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int num= sc.nextInt();
        String ans=dectoNBase(n,num);
        System.out.println(ans);
    }
}
