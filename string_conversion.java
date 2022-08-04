package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class string_conversion {
    public static int stringConversion(String s,int[] a){
        for(int i=0;i<a.length;i++){
            String binaryForm=Integer.toBinaryString(a[i]);
            if(!s.contains(binaryForm)){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            String s=sc.next();
            int n= sc.nextInt();
            int[] arr=new int[n];
            for(int j=0;j<n;j++){
                arr[j]= sc.nextInt();
            }
            int ans=stringConversion(s,arr);
            System.out.println(ans);
        }
    }
}
