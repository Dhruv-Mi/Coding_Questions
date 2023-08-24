package com.company;

import java.util.Scanner;

public class Container_with_most_water {
    public static int maxArea(int[] height){
        int left=0;
        int right= height.length-1;
        int ans=Integer.MIN_VALUE;
        while(left<right){
            int temp=Math.min(height[left],height[right]);
            int diff=right-left;
            int area=diff*temp;
            ans=Math.max(area,ans);
            if(height[left]>height[right]){
                right--;
            }
            else{
                left++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] height=new int[n];
        for(int i=0;i<n;i++){
            height[i]= sc.nextInt();
        }
        int ans=maxArea(height);
        System.out.println(ans);
    }
}
