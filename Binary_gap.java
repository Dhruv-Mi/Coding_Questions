package com.company;

import java.util.Scanner;

public class Binary_gap {
    public static int binaryGap(int n){
        String binary=Integer.toBinaryString(n);
        int count=1;
        int ans=0;
        int check=0;
        for(int i=0;i<binary.length();i++){
            char ch=binary.charAt(i);
            if(ch=='1'){
                if(check==0){
                    check=1;
                }
                else{
                    ans=Math.max(ans,count);
                    count=1;
                    check=0;
                    i--;
                }
            }
            else{
                count++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int ans=binaryGap(n);
        System.out.println(ans);
    }
}
