package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Path_crossing {
    public static boolean isPathCrossing(String path){
        int x=0;
        int y=0;
        ArrayList<String> arr=new ArrayList<>();
        arr.add("0,0");
        for(int i=0;i<path.length();i++){
            char ch=path.charAt(i);
            String temp;
            if(ch=='N'){
                y=y+1;
                temp=x+","+y;
            }
            else if(ch=='S'){
                y=y-1;
                temp=x+","+y;
            }
            else if(ch=='E'){
                x=x+1;
                temp=x+","+y;
            }
            else{
                x=x-1;
                temp=x+","+y;
            }
            System.out.println(temp);
            if(arr.contains(temp)){
                System.out.println("ans "+temp);
                return true;
            }
            else{
                arr.add(temp);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String path= sc.next();
        boolean ans=isPathCrossing(path);
        System.out.println(ans);
    }
}
