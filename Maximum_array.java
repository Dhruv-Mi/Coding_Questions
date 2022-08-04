package com.company;

import java.util.Scanner;

public class Maximum_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] input=new int[n];
        for(int i=0;i<n;i++){
            input[i]= sc.nextInt();
        }
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            int temp = input[i];
            int tempMax = -1;
            int size;
            int index;
            boolean check=true;
            if(i!=n-1) {
                size = i+1;
                index = i + 1;
                while (tempMax==-1&&size!=n) {
                    if(temp<input[index]){
                        tempMax=input[index];
                        ans[i]=tempMax;
                        check=false;
                    }
                    size++;
                    index++;
                }
            }
            else{
                size = 0;
                index = 0;
                while(tempMax==-1&&size<n-1){
                    if(temp<input[index]){
                        tempMax=input[index];
                        ans[i]=tempMax;
                        check=false;
                    }
                    size++;
                    index++;
                }
            }
            if(check){
                ans[i]=-1;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
