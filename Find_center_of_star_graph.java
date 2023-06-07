package com.company;

import java.util.Scanner;

public class Find_center_of_star_graph {
    public static int findCenter(int[][] edges){
        int first=edges[0][0];
        int second=edges[0][1];
        int tempFirst=edges[1][0];
        int tempSecond=edges[1][1];
        if(first==tempFirst || first==tempSecond){
            return first;
        }
        else{
            return second;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[][] edges=new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                edges[i][j]= sc.nextInt();
            }
        }
        int ans=findCenter(edges);
        System.out.println(ans);
    }
}
