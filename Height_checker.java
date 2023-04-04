package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Height_checker {
    public static int heightChecker(int[] heights){
        int[] temp=new int[heights.length];
        System.arraycopy(heights, 0, temp, 0, temp.length);
        Arrays.sort(heights);
        int ans=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=temp[i]){
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] heights=new int[n];
        for(int i=0;i<n;i++){
            heights[i]=sc.nextInt();
        }
        int ans=heightChecker(heights);
        System.out.println(ans);
    }
}
