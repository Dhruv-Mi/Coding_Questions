package com.company;

import java.util.Scanner;

public class Count_square_sum_triples {
    public static int countTriples(int n){
        int ans=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i != j){
//                    for(int k=1;k<=n;k++){
//                        if(Math.pow(i,2)+Math.pow(j,2)==Math.pow(k,2)){
//                            ans++;
//                        }
//                    }
                    double c=Math.sqrt(Math.pow(i,2)+Math.pow(j,2));
                    int check=(int) c;
                    if(c==check && 1<=check && check<=n){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int ans=countTriples(n);
        System.out.println(ans);
    }
}
