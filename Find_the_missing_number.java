package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Find_the_missing_number {
    public static int missingNumber(int[] array,int num){
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int j : array) {
            if (!map.containsKey(j)) {
                map.put(j, 1);
            }
        }
        for(int i=1;i<=num;i++){
            if(!map.containsKey(i)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]= sc.nextInt();
        }
        int num= sc.nextInt();
        int ans=missingNumber(array,num);
        System.out.println(ans);
    }
}
