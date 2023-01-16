package com.company;

import java.util.Scanner;

public class Next_greater_element_1 {
    public static int[] nextGreaterElement(int[] num1,int[] num2){
        int n1= num1.length;
        int n2= num2.length;
        int[] ans=new int[n1];
        for(int i=0;i<n1;i++){
            int temp=num1[i];
            for(int j=0;j<n2;j++){
                if(temp==num2[j]){
                    int max=-1;
                    for(int k=j+1;k<n2;k++){
                        if(temp<num2[k]){
                            max=num2[k];
                            break;
                        }
                    }
                    ans[i]=max;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int[] num1=new int[n1];
        int[] num2=new int[n2];
        for(int i=0;i<n1;i++){
            num1[i]= sc.nextInt();
        }
        for(int i=0;i<n2;i++){
            num2[i]= sc.nextInt();
        }
        int[] ans=nextGreaterElement(num1,num2);
        for (int an : ans) {
            System.out.print(an + " ");
        }
    }
}
