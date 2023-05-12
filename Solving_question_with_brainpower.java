package com.company;

import java.util.Scanner;

public class Solving_question_with_brainpower {
    public static long mostPoints(int[][] questions){
        return mostPointsHelper(questions,0);
    }
    public static long mostPointsHelper(int[][] questions,int index){
        if(index>= questions.length){
            return 0;
        }
        long temp1=questions[index][0]+mostPointsHelper(questions,index+questions[index][1]+1);
        long temp2=mostPointsHelper(questions,index+1);
        return Math.max(temp1,temp2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[][] questions=new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                questions[i][j]= sc.nextInt();
            }
        }
        long ans=mostPoints(questions);
        System.out.println(ans);
    }
}
