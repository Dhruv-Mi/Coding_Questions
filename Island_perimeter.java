package com.company;

import java.util.Scanner;

public class Island_perimeter {
    public static int islandPerimeter(int[][] grid) {
        int n = grid.length , m = grid[0].length;
        int perimeter = 0 , sides;
        for(int i = 0 ; i < n ; i++)
            for(int j = 0 ; j < m;  j++) {
                if(grid[i][j] == 1) {
                    sides = 0;
                    if(i == 0)
                        sides++;
                    else if(grid[i - 1][j] == 0)
                        sides++;
                    if(j == 0)
                        sides++;
                    else if(grid[i][j - 1] == 0)
                        sides++;
                    if(i == n - 1)
                        sides++;
                    else if(grid[i + 1][j] == 0)
                        sides++;
                    if(j == m - 1)
                        sides++;
                    else if(grid[i][j + 1] == 0)
                        sides++;
                    perimeter += sides;
                }
            }
        return perimeter;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int[][] grid=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                grid[i][j]= sc.nextInt();
            }
        }
        int ans=islandPerimeter(grid);
        System.out.println(ans);
    }
}
