package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class card_removal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for (int i=0;i<t;i++){
            int n= sc.nextInt();
            int[] input=new int[n];
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int j=0;j<n;j++){
                input[j]= sc.nextInt();
                if(map.containsKey(input[j])){
                   int value= map.get(input[j])+1;
                   map.replace(input[j],value);
                }
                else{
                    map.put(input[j],1);
                }
            }
            int max=Integer.MIN_VALUE;
            for(int k=0;k<n;k++){
                if(map.get(input[k])>max){
                    max=map.get(input[k]);
                }
            }
            System.out.println(n-max);
        }
    }
}
