package com.company;

import java.util.*;

public class Matrix_cell_in_distance_order {
    public static int[][] allCellsDistOrder(int row, int col, int rCenter, int cCenter){
        HashMap<int[], Integer> map=new HashMap<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int distance=Math.abs(rCenter-i)+Math.abs(cCenter-j);
                int[] temp=new int[2];
                temp[0]=i;
                temp[1]=j;
                if(!map.containsKey(temp)){
                    map.put(temp,distance);
                }
            }
        }
        int[][] keys= map.keySet().toArray(new int[0][]);
        int[][] ans=new int[keys.length][2];
        System.arraycopy(keys, 0, ans, 0, keys.length);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row= sc.nextInt();
        int col= sc.nextInt();
        int rCenter= sc.nextInt();
        int cCenter= sc.nextInt();
        int[][] ans= allCellsDistOrder(row, col, rCenter, cCenter);
        for (int[] an : ans) {
            System.out.print(an[0] + " " + an[1] + " ");
        }
    }
}
