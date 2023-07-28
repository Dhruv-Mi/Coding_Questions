package com.company;

import java.util.Scanner;

public class Predict_the_winner {
    public static boolean PredictTheWinner(int[] nums){
        return predictTheWinnerHelper(nums,0,nums.length-1,0,0,'a');
    }
    public static boolean predictTheWinnerHelper(int[] nums,int left,int right,int scoreA,int scoreB,char turn){
        if(left>right){
            return scoreA>=scoreB;
        }

        if(turn=='a'){
            boolean ans1=predictTheWinnerHelper(nums,left+1,right,scoreA+nums[left],scoreB,'b');
            boolean ans2=predictTheWinnerHelper(nums,left,right-1,scoreA+nums[right],scoreB,'b');
            return ans1||ans2;
        }
        else{
            boolean ans1=predictTheWinnerHelper(nums,left+1,right,scoreA,scoreB+nums[left],'a');
            boolean ans2=predictTheWinnerHelper(nums,left,right-1,scoreA,scoreB+nums[right],'a');
            return ans1&&ans2;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]= sc.nextInt();
        }
        boolean ans=PredictTheWinner(nums);
        System.out.println(ans);
    }
}
