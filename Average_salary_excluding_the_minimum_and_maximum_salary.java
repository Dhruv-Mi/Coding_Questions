package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Average_salary_excluding_the_minimum_and_maximum_salary {
    public static double average(int[] salary){
        int n= salary.length;
        Arrays.sort(salary);
        int smallest=salary[0];
        int largest=salary[n-1];
        int count=0;
        double sum=0;
        for(int i=1;i<n-1;i++){
            if(smallest!=salary[i] && salary[i]!=largest){
                sum=sum+salary[i];
                count++;
            }
        }
        return sum/count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] salary=new int[n];
        for(int i=0;i<n;i++){
            salary[i]= sc.nextInt();
        }
        double ans=average(salary);
        System.out.println(ans);
    }
}
