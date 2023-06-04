package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Number_of_provinces {
    public static int findCircleNum(int[][] isConnected){
        int n=isConnected.length;
        HashMap<Integer, List<Integer>> adjList=new HashMap<>();
        for(int i=0;i<n;i++){
            List<Integer> neighbour=new ArrayList<>();
            for(int j=0;j<n;j++){
                if(i!=j && isConnected[i][j]==1){
                    neighbour.add(j+1);
                }
            }
            adjList.put(i+1,neighbour);
        }
        int[] visited=new int[n+1];
        int ans=0;
        for(int i=1;i<=n;i++){
            if(visited[i]==0){
                ans++;
                checkVisited(i,adjList,visited);
            }
        }
        return ans;
    }
    public static void checkVisited(int node,HashMap<Integer,List<Integer>> adjList,int[] visited){
        visited[node]=1;
        List<Integer> neighbour=adjList.get(node);
        for (Integer integer : neighbour) {
            if (visited[integer] == 0) {
                checkVisited(integer, adjList, visited);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[][] isConnected=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                isConnected[i][j]= sc.nextInt();
            }
        }
        int ans=findCircleNum(isConnected);
        System.out.println(ans);
    }
}
