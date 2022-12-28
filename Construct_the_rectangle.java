package com.company;

import java.util.Scanner;

public class Construct_the_rectangle {
    public static int[] constructRectangle(int area){
        int width = (int) Math.sqrt(area);
        while (area % width > 0)
            --width;
        return new int[] {area / width, width};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] ans=constructRectangle(n);
        System.out.print(ans[0]+" "+ans[1]);
    }
}
