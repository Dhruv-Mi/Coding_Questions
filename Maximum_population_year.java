package com.company;

import java.util.Scanner;

public class Maximum_population_year {
    public static int maximumPopulation(int[][] logs){
        int ans=Integer.MIN_VALUE;
        int result=Integer.MAX_VALUE;
        for (int[] ints : logs) {
            int count = 0;
            int birth = ints[0];
            for (int[] log : logs) {
                if (log[0] <= birth && birth <= log[1] - 1) {
                    count++;
                }
            }
            if(count==ans && birth<result){
                result=birth;
            }
            else if (count > ans) {
                ans = count;
                result = birth;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[][] logs=new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                logs[i][j]= sc.nextInt();
            }
        }
        int ans=maximumPopulation(logs);
        System.out.println(ans);
    }
}
