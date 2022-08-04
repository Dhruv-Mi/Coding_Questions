package com.company;

import java.util.Scanner;

public class Find_duplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        int i;
        for(i=0;i<t;i++){
            int n= sc.nextInt();
            int[] input=new int[n];
            for(i=0;i<n;i++){
                input[i]=sc.nextInt();
            }
            int duplicate=duplicateNumber(input);
            System.out.println(duplicate);
        }
    }

    private static int duplicateNumber(int[] arr) {
        int n= arr.length;
        int i,j;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return 0;
    }
}
