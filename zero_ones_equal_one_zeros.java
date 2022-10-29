package com.company;

import java.util.Scanner;

public class zero_ones_equal_one_zeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            int N = sc.nextInt();
            String S = "";
            if(N % 2 == 0){
                S = S + "1";
                for(int j = 0; j < N-2; j++){
                    S = S +"0";
                }
                S = S + "1";
            }
            else{
                for(int j = 0; j < N; j++){
                    if(j == N/2)
                        S += "1";
                    else
                        S += "0";
                }

            }
            System.out.println(S);
        }
    }
}
