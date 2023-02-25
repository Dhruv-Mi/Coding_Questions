package com.company;

import java.util.Scanner;

public class range_addition_ii {
    public static int maxCount(int m,int n,int[][] ops){
        if(ops.length==0){
            return m*n;
        }
        else{
            int first_min=Integer.MAX_VALUE;
            int second_min=Integer.MAX_VALUE;
            for (int[] op : ops) {
                first_min = Math.min(op[0], first_min);
                second_min = Math.min(op[1], second_min);
            }
            return first_min*second_min;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        int r= sc.nextInt();
        int[][] ops=new int[r][2];
        for(int i=0;i<r;i++){
            for(int j=0;j<2;j++){
                ops[i][j]= sc.nextInt();
            }
        }
        int ans=maxCount(m,n,ops);
        System.out.println(ans);
    }
}
