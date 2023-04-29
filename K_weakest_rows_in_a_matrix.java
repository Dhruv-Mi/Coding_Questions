package com.company;

import java.util.*;

public class K_weakest_rows_in_a_matrix {
    public static int[] kWeakestRows(int[][] mat,int k){
        int m=mat.length;
        int n=mat[0].length;
        int[] rows=new int[m];
        for(int i=0;i<m;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            rows[i]=count;
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<m;i++){
            arr.add(rows[i]);
        }
        Arrays.sort(rows);
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<k;i++){
            int value=rows[i];
            for(int j=0;j<m;j++){
                if(arr.get(j)==value && !result.contains(j)){
                    result.add(j);
                }
            }
        }
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=result.get(i);
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
        int k= sc.nextInt();
        int[] ans=kWeakestRows(mat,k);
        for (int an : ans) {
            System.out.print(an + " ");
        }
    }
}
