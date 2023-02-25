package com.company;

import java.util.Scanner;

public class can_place_flower {
    public static boolean canPlaceFlowers(int[] flowerbed,int n){
        int length= flowerbed.length;
        if(flowerbed.length==1){
            if(flowerbed[0]==0){
                return n<=1;
            }
            else {
                return n==0;
            }
        }
        for(int i=0;i<length;i++){
            int temp=flowerbed[i];
            if(temp!=1){
                if(i==0){
                    if(flowerbed[1]==0){
                        flowerbed[i]=1;
                        n--;
                    }
                }
                else if(i==length-1){
                    if(flowerbed[length-2]==0){
                        flowerbed[i]=1;
                        n--;
                    }
                }
                else{
                    if(flowerbed[i-1]==0 && flowerbed[i+1]==0){
                        flowerbed[i]=1;
                        n--;
                    }
                }
            }
        }
        return n==0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] flower_bed=new int[n];
        for(int i=0;i<n;i++){
            flower_bed[i]= sc.nextInt();
        }
        int count= sc.nextInt();
        boolean ans=canPlaceFlowers(flower_bed,count);
        System.out.println(ans);
    }
}
