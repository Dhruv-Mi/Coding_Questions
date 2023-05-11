package com.company;

import java.util.Scanner;

public class Xor_operation_in_an_array {
    public static int xorOperation(int n,int start){
        int ans=start;
        for(int i=1;i<n;i++){
            ans=ans^(start+(2*i));
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int start= sc.nextInt();
        int ans=xorOperation(n,start);
        System.out.println(ans);
    }
}
