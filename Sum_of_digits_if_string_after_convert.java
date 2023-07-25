package com.company;

import java.util.Scanner;

public class Sum_of_digits_if_string_after_convert {
    public static int getLucky(String s,int k){
        String num="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            num=num+((ch-'a')+1);
        }
        int ans;
        while(k>0){
            int temp=0;
            for(int i=0;i<num.length();i++){
                temp=temp+Integer.parseInt(num.charAt(i)+"");
            }
            num=""+temp;
            k--;
        }
        ans=Integer.parseInt(num);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int k= sc.nextInt();
        int ans=getLucky(s,k);
        System.out.println(ans);
    }
}
