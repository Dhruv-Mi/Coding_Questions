package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class way_to_make_coin_change {
    public static int countWaysToMakeChange(int[] denomination,int value){
        return countWaysToMakeChangeHelp(denomination,value,0);
    }
    public static int countWaysToMakeChangeHelp(int[] denomination,int value,int index){
        if(index>denomination.length-1){
            return 0;
        }
        if(value<0){
            return 0;
        }
        if(value==0){
            return 1;
        }
        int opt1=countWaysToMakeChangeHelp(denomination,value-denomination[index],index);
        int opt2=countWaysToMakeChangeHelp(denomination,value,index+1);
        return opt1+opt2;
    }
    public static int countWaysToMakeChangeM(int[] denomination,int value){
        int[] storage=new int[value+1];
        Arrays.fill(storage, -1);
        return countWaysToMakeChangeMHelp(denomination,value,0,storage);
    }
    public static int countWaysToMakeChangeMHelp(int[] denomination,int value,int index,int[] storage){
        if(index>denomination.length-1){
            return 0;
        }
        if(value<0){
            return 0;
        }
        if(value==0){
            storage[index]=1;
            return 1;
        }
        if(storage[index]!=-1){
            return storage[index];
        }
        int opt1=countWaysToMakeChangeHelp(denomination,value-denomination[index],index);
        int opt2=countWaysToMakeChangeHelp(denomination,value,index+1);
        storage[index]=opt1+opt2;
        return storage[index];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] input=new int[n];
        for(int i=0;i<n;i++){
            input[i]= sc.nextInt();
        }
        int value= sc.nextInt();
        int ans=countWaysToMakeChange(input,value);
        int ans2=countWaysToMakeChangeM(input,value);
        System.out.println(ans2);
        System.out.println(ans);
    }
}
