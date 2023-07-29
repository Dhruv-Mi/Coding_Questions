package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Find_if_path_exists_in_graph {
    public static boolean validPath(int n,int[][] edges,int source,int destination){
        int[][] matrix=new int[n][n];
        for (int[] edge : edges) {
            matrix[edge[0]][edge[1]] = 1;
            matrix[edge[1]][edge[0]] = 1;
        }
        boolean[] visibility=new boolean[n];
        for(int i=0;i<n;i++){
            visibility[i]=false;
        }
        hasPath(matrix,visibility);
        return visibility[source] && visibility[destination];
    }
    public static void hasPath(int[][] matrix,boolean[] visibility){
        Queue<Integer> pending=new LinkedList<>();
        pending.add(0);
        visibility[0]=true;
        while (!pending.isEmpty()){
            int front=pending.peek();
            pending.remove();
            for(int i=0;i< matrix.length;i++){
                if(matrix[front][i]==1 && !visibility[i]){
                    pending.add(i);
                    visibility[i]=true;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int count= sc.nextInt();
        int[][] edges=new int[count][2];
        for(int i=0;i<count;i++){
            for(int j=0;j<2;j++){
                edges[i][j]= sc.nextInt();
            }
        }
        int source= sc.nextInt();
        int destination= sc.nextInt();
        boolean ans=validPath(n,edges,source,destination);
        System.out.println(ans);
    }
}
