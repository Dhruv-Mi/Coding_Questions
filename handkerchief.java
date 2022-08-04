package com.company;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class handkerchief {
    public static int handkerChief(int[] v){
        int count=0;
        for(int i=0;i<v.length;i++){
            if(i>0&&v[i-1]<v[i]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int n= sc.nextInt();
            int[] input=new int[n];
            for(int j=0;j<n;j++){
                input[j]= sc.nextInt();
            }
            int ans=handkerChief(input);
            System.out.println(ans);
        }
    }
}
