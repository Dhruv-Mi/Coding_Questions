package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Minimize_the_difference {
    public static int minimizeIt(int[] a,int k){
        int n=a.length;
        Arrays.sort(a);
        int ans=a[n-1]-a[0];
        int smallest=a[0]+k;
        int largest=a[n-1]-k;
        for(int i=0;i<n-1;i++){
            int min=Math.min(smallest,a[i+1]-k);
            int max=Math.max(largest,a[i+1]+k);
            if(min<0){
                continue;
            }
            ans=Math.min(ans,max-min);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        int k= sc.nextInt();
        int ans=minimizeIt(a,k);
        System.out.println(ans);
    }
}
