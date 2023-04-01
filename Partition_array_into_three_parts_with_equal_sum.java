package com.company;

import java.util.Scanner;

public class Partition_array_into_three_parts_with_equal_sum {
    public static boolean canThreePartsEqualSum(int[] arr){
        int total=0;
        for(int val: arr) {
            total += val;
        }

        if(total %3 != 0)
            return false;

        int equalSum = total/3;
        int totalParts=0;
        total=0;
        for(int index=0; index < arr.length; index++) {
            total+= arr[index];
            if(total == equalSum && totalParts < 2 && index != arr.length-1) {
                totalParts++;
                total=0;
            }
        }
        if(total == equalSum)
            totalParts++;
        return totalParts==3;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        boolean ans=canThreePartsEqualSum(arr);
        System.out.println(ans);
    }
}
