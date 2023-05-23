package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Most_visited_sector_in_a_circular_track {
    public static List<Integer> mostVisited(int n,int[] rounds){
        int[] result=new int[n+1];
        for(int i=0;i< rounds.length-1;i++){
            int start=rounds[i];
            int end=rounds[i+1];
            if(start<=end){
                if(i>0){
                    result[start]--;
                }
                for(int j=start;j<=end;j++){
                    result[j]++;
                }
            }
            else{
                if(i>0){
                    result[start]--;
                }
                for(int j=start;j<=n;j++){
                    result[j]++;
                }
                for(int j=1;j<end;j++){
                    result[j]++;
                }
            }
        }
        List<Integer> ans=new ArrayList<>();
        int maximum=Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){
            int value=result[i];
            if(value>maximum){
                ans=new ArrayList<>();
                ans.add(i);
                maximum=value;
            }
            else if(value==maximum){
                ans.add(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int[] rounds=new int[m];
        for(int i=0;i<m;i++){
            rounds[i]= sc.nextInt();
        }
        List<Integer> ans=mostVisited(n,rounds);
        for (Integer an : ans) {
            System.out.print(an+" ");
        }
    }
}
