package com.company;

import java.util.Scanner;

public class linear_search {
    public static int LinearSearch(int[] arr,int x){
        int size = arr.length;
        int i;
        for(i=0;i<size;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        int t= sc.nextInt();
        for(i=0;i<t;i++){
            int size= sc.nextInt();
            int[] input=new int[size];
            for(int j=0;j<size;j++){
                input[j]= sc.nextInt();
            }
            int x= sc.nextInt();
            System.out.println(LinearSearch(input,x));
        }
    }
}
