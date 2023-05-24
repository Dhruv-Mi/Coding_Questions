package com.company;

import java.util.Scanner;

public class Special_position_in_a_binary_matrix {
    public static int numSpecial(int[][] mat){
        int n=mat[0].length;
        int ans=0;
        for (int[] ints : mat) {
            for (int j = 0; j < n; j++) {
                int val = ints[j];
                if (val == 1) {
                    int count = 0;
                    for (int[] value : mat) {
                        if (value[j] == 1) {
                            count++;
                        }
                    }
                    for (int k = 0; k < n; k++) {
                        if (ints[k] == 1) {
                            count++;
                        }
                    }
                    if (count == 2) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        int[][] mat=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]= sc.nextInt();
            }
        }
        int ans=numSpecial(mat);
        System.out.println(ans);
    }
}
