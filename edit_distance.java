package com.company;

import java.util.Scanner;

public class edit_distance {
    public static int editDistance(String s,String t){
        return editDistanceHelp(s,t,0,0);
    }
    public static int editDistanceHelp(String s,String t,int sLen,int tLen){
        if(sLen>s.length()-1||tLen>t.length()-1){
            return 0;
        }
        int opt1=editDistanceHelp(s,t,sLen+1,tLen);
        int opt2=editDistanceHelp(s,t,sLen+1,tLen+1);
        return Math.min(opt1,opt2)+1;
    }
    public static int editDistanceM(String s,String t){
        int m=s.length();
        int  n=t.length();
        int[][] storage=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                storage[i][j]=-1;
            }
        }
        return editDistanceMHelp(s,t,0,0,storage);
    }
    public static int editDistanceMHelp(String s,String t,int sLen,int tLen,int[][] storage){
        if(sLen>s.length()-1||tLen>t.length()-1){
            storage[sLen][tLen]=0;
            return 0;
        }
        if(storage[sLen][tLen]!=-1){
            return storage[sLen][tLen];
        }
        int opt1=editDistanceHelp(s,t,sLen+1,tLen);
        int opt2=editDistanceHelp(s,t,sLen+1,tLen+1);
        storage[sLen][tLen]=Math.min(opt1,opt2)+1;
        return storage[sLen][tLen];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String inp1= sc.next();
        String inp2= sc.next();
        int ans2=editDistanceM(inp1,inp2);
        int ans=editDistance(inp1,inp2);
        System.out.println(ans);
        System.out.println(ans2);
    }
}
