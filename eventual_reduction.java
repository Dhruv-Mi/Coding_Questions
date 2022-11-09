package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class eventual_reduction {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int inp = scnr.nextInt();
        while(inp-->0){
            int n= scnr.nextInt();
            String s = scnr.next();
            char[] ch_arr = s.toCharArray();
            Arrays.sort(ch_arr);
            int count = 1;
            int flag = 0;
            for(int i =1; i<n;i++){
                if(ch_arr[i-1]==ch_arr[i]){
                    count = count+1;
                }else{
                    if(count%2 == 1){
                        System.out.println("NO");
                        flag = 1;
                        break;
                    }else{
                        count = 1;
                    }
                }
            }
            if(count%2 == 1 && flag == 0){
                System.out.println("NO");
            }else if(flag == 0){
                System.out.println("YES");
            }
        }
    }
}
