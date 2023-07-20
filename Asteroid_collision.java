package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Asteroid_collision {
    public static int[] asteroidCollision(int[] asteroids){
        ArrayList<Integer> ast=new ArrayList<>();
        for (int asteroid : asteroids) {
            ast.add(asteroid);
        }
        for(int i=0;i<ast.size()-1;i++){
            int first=ast.get(i);
            int second=ast.get(i+1);
            if(first>0 && second<0){
                if(Math.abs(first)>Math.abs(second)){
                    ast.remove(i+1);
                    i--;
                }
                else if(Math.abs(first)<Math.abs(second)){
                    ast.remove(i);
                    if(i==0){
                        i=-1;
                    }
                    else{
                        i=i-2;
                    }
                }
                else{
                    ast.remove(i+1);
                    ast.remove(i);
                    if(i==0){
                        i=-1;
                    }
                    else{
                        i=i-2;
                    }
                }
            }
        }
        int[] ans=new int[ast.size()];
        for(int i=0;i<ast.size();i++){
            ans[i]=ast.get(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] asteroids=new int[n];
        for(int i=0;i<n;i++){
            asteroids[i]= sc.nextInt();
        }
        int[] ans=asteroidCollision(asteroids);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
