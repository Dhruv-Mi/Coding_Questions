package com.company;

import java.util.Scanner;

public class Number_of_student_doing_homework_at_a_given_time {
    public static int busyStudent(int[] startTime,int[] endTime,int queryTime){
        int ans=0;
        for(int i=0;i<startTime.length;i++){
            int start=startTime[i];
            int end=endTime[i];
            if(queryTime>=start && queryTime<=end){
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] startTime=new int[n];
        int[] endTime=new int[n];
        for(int i=0;i<n;i++){
            startTime[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            endTime[i]= sc.nextInt();
        }
        int queryTime= sc.nextInt();
        int ans=busyStudent(startTime,endTime,queryTime);
        System.out.println(ans);
    }
}
